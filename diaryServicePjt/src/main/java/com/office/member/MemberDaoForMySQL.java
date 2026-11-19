package com.office.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDaoForMySQL implements IMemberDao {
	
	final private String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	final private String URL = "jdbc:mysql://127.0.0.1:3306/db_diary";
	final private String USERNAME = "root";
	final private String PASSWORD = "1234";

	@Override
	public boolean isMember(String memId) {
		
        int result = 0;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        Connection conn = null;
        
        try {
        	// 1. 드라이버 로드 , 메모리 안에
        	Class.forName(DRIVER);
        	
        	// 2. 다리 건설: Connection 생성 by 인증(Authentication)
        	conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        	
        	// 3. SQL 쿼리문 작성(작업 지시서)
        	String sql = "select count(*) cnt from tbl_member where memId = ?"; // 이렇게 물음표 해두는것을 스테이터스 라고 한다
        	
        	// 4. 일꾼 선택(생성) , 괄호 안에 쿼리문을 넣어줘야 한다
        	pstmt = conn.prepareStatement(sql); 
        	
        	// 5. 데이터 주입
        	pstmt.setString(1, memId);
        	
        	// 6. 작업 지시
        	rs = pstmt.executeQuery();
        	
        	/*
        	 * executeQuery(): select, 반환형(ResultSet) -> while문으로 사용하자
        	 * executeUpdate(): insert, update, delete, 반환형(int) -> 영향을 받은 행의 수 
        	 */
        	
        	// 7. 가져온 데이터 분석
        	while (rs.next()) {
				result = rs.getInt("cnt");
				
			}
        	
        } catch (Exception e) {
        	e.printStackTrace();
        	
        } finally {
        	
        	// 8. 외부 자원 해제
        	try {
        		if(rs != null) rs.close();
        		if(pstmt != null) pstmt.close();
        		if(conn != null) conn.close();
        	} catch (Exception e2) {
        		e2.printStackTrace();
        	}
        	
        }
        
		return result == 0 ? false : true;
	}

	@Override
	public int insertNewMember(MemberDto memberDto) {
		
		int result = 0;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        
        try {
        	// 1. 드라이버 로드 , 메모리 안에
        	Class.forName(DRIVER);
        	
        	// 2. 다리 건설: Connection 생성 by 인증(Authentication)
        	conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        	
        	// 3. SQL 쿼리문 작성(작업 지시서)
        	String sql = "insert into tbl_member(memId, memPw, memMail, memPhone) values(?, ?, ?, ?)";
        	
        	// 4. 일꾼 선택(생성) , 괄호 안에 쿼리문을 넣어줘야 한다
        	pstmt = conn.prepareStatement(sql); 
        	
        	// 5. 데이터 주입
        	pstmt = setString(1,memberDto.getMemId());
        	pstmt = setString(2,memberDto.getMemPw());
        	pstmt = setString(3,memberDto.getMemMail());
        	pstmt = setString(4,memberDto.getMemPhone());
        	
        	// 6. 작업 지시
        	result = pstmt.executeUpdate();
        	
        	/*
        	 * executeQuery(): select, 반환형(ResultSet) -> while문으로 사용하자
        	 * executeUpdate(): insert, update, delete, 반환형(int) -> 영향을 받은 행의 수 
        	 */
        	
        } catch (Exception e) {
        	e.printStackTrace();
        	
        } finally {
        	
        	// 8. 외부 자원 해제
        	try {
        		if(pstmt != null) pstmt.close();
        		if(conn != null) conn.close();
        	} catch (Exception e2) {
        		e2.printStackTrace();
        	}
        	
        }
        
		return result;
		
	}

	@Override
	public MemberDto selectMemberByMemId(String memId) {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
