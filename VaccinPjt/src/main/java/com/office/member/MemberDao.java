package com.office.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import com.office.DatabaseInfo;

public class MemberDao implements DatabaseInfo {
	
	public boolean isMember(String admin_id) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			// 1. 메모리에 드라이버 로드 
			Class.forName(DRIVER);
			// 2. 다리 연결: 커넥션
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// 3. 작업 지시서
			String sql = "select "
						+ "count(*) "
						+ "cnt "
						+ "from "
						+ "tbl_admin "
						+ "where "
						+ "admin_id = ?";
			
			// 4. 일꾼 구한다 
			pstmt = conn.prepareStatement(sql);
			
			// 5. 데이터 주입 일꾼한테
			pstmt.setString(1, admin_id);
			
			// 6. 작업 지시
			rs = pstmt.executeQuery();
			
			// 7. 데이터 추출, 분석
			while (rs.next()) {
				result = rs.getInt("cnt");  // 0 아니면 1
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			// 8. 외부 자원 해제
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return result > 0 ? true : false;
	}
	
	
	
public int insertNewMember(MemberDto memberDto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			// 1. 드라이버 로드 in 메모리
			Class.forName(DRIVER);
			
			// 2. 다리 연결: 커넥션
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// 3. 작업 지시서 작성 : SQL문
			String sql =  "insert into "
						+ "tbl_admin(admin_id, admin_pw, admin_mail, admin_phone) "
						+ "values(?, ?, ?, ?)";                          
 			
			// 4. 일꾼 구한다. : preparedStatement
			pstmt = conn.prepareStatement(sql);
			
			// 5. 데이터 주입 --> 일꾼한테
			pstmt.setString(1, memberDto.getAdmin_id());
			pstmt.setString(2, memberDto.getAdmin_pw());
			pstmt.setString(3, memberDto.getAdmin_mail());
			pstmt.setString(4, memberDto.getAdmin_phone());
			
			// 6. 작업 지시
			result = pstmt.executeUpdate();  // 0 1
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			// 8. 외부 자원 해제
			try {

				if (pstmt != null) 	pstmt.close();
				if (conn != null) 	conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
		}
		
		return result;  // -1  0  1 
		
	}



public MemberDto selectMemberByAdminId(String id) {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<MemberDto> memberDtos = new Vector<MemberDto>();
	
	try {
		// 1. 드라이버 로드 in 메모리
		Class.forName(DRIVER);
		
		// 2. 다리 연결: 커넥션
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		// 3. 작업 지시서 작성 : SQL문
		String sql =  "select "
					+ 	"* "
					+ "from "
					+ 	"tbl_admin "
					+ "where "
					+ 	"admin_id = ?";                          
			
		// 4. 일꾼 구한다. : preparedStatement
		pstmt = conn.prepareStatement(sql);
		
		// 5. 데이터 주입 --> 일꾼한테
		pstmt.setString(1, id);
		
		
		// 6. 작업 지시
		rs = pstmt.executeQuery();  // 0 1
		
		// 7. 데이터 추출
		while (rs.next()) {
			int admin_no = rs.getInt("admin_no");
			String admin_id = rs.getString("admin_id");
			String admin_pw = rs.getString("admin_pw");
			String admin_mail = rs.getString("admin_mail");
			String admin_phone = rs.getString("admin_phone");
			String admin_reg_date = rs.getString("admin_reg_date");
			String admin_mod_date = rs.getString("admin_mod_date");
			
			MemberDto dto = new MemberDto(admin_no, admin_id, 
					admin_pw, admin_mail, admin_phone, 
					admin_reg_date, admin_mod_date);
			
			memberDtos.add(dto);
			
			
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
		
		// 8. 외부 자원 해제
			try {
				if (rs != null) 	rs.close();
				if (pstmt != null) 	pstmt.close();
				if (conn != null) 	conn.close();
			
			} catch (Exception e2) {
				e2.printStackTrace();
			
			}
		
		}

		return memberDtos.size() > 0 ? memberDtos.get(0) : null; 
		
	}

}