package com.office.diary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DiaryDao {
	
	final private String DRIVER = "com.mysql.cj.jdbc.Driver";
	final private String URL = "jdbc:mysql://127.0.0.1:3306/db_diary";
	final private String USERNAME = "root";
	final private String PASSWORD = "1234";

	public int insertNewDiary(DiaryDto diaryDto) {
		
        int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드 in 메모리
			Class.forName(DRIVER);
			
			// 2. 다리 건설: Connection 생성 by 인증(Authentication)
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// 3. SQL 작성(작업 지시서)
			String sql = "insert into tbl_diary(diaryWord, memId) values(?, ?)";
			
			// 4. 일꾼 선택(생성)
			pstmt = conn.prepareStatement(sql);
			
			// 5. 데이터 주입
			pstmt.setString(1, diaryDto.getDiaryWord());
			pstmt.setString(2, diaryDto.getMemId());
			
			// 6. 작업 지시
			result = pstmt.executeUpdate();
			
			/*
			 * executeQuery(): select, 반환형(ResultSet) -> while문으로 사용하자
			 * executeUpdate(): insert, update, delete, 반환형(int) -> 영향을 받은 행 수
			 */
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			
			//8. 외부 자원 해제
			
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}	
		}
		return result;
		
	}

	public List<DiaryDto> selectDiariesByMemId(String signinedMemberId) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DiaryDto> diaryDtos = new ArrayList<DiaryDto>();
		
		
		try {
			// 1. 드라이버 로드 in 메모리
			Class.forName(DRIVER);
			
			// 2. 다리 건설: Connection 생성 by 인증(Authentication)
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// 3. SQL 작성(작업 지시서)
			String sql = "select * from tbl_diary td"
					   + "join tbl_member tm"
					   + "on td.memId = tm.memId"
					   + "where td.memId = ?";
			
			// 4. 일꾼 선택(생성)
			pstmt = conn.prepareStatement(sql);
			
			// 5. 데이터 주입
			pstmt.setString(1, signinedMemberId);
			
			
			// 6. 작업 지시
			rs = pstmt.executeQuery();
			
			/*
			 * executeQuery(): select, 반환형(ResultSet) -> while문으로 사용하자
			 * executeUpdate(): insert, update, delete, 반환형(int) -> 영향을 받은 행 수
			 */
			
			while (rs.next()) {
				int diaryNo = rs.getInt("diaryNo");
				String diaryWord = rs.getString("diaryWord");
				String memId = rs.getString("memId");
				String diaryRegDate = rs.getString("diaryRegDate");
				String diaryModDate = rs.getString("diaryModDate");
				int memNo = rs.getInt("memNo");
				String memPw = rs.getString("memPw");
				String memMail = rs.getString("memMail");
				String memPhone = rs.getString("memPhone");
				String memRegDate = rs.getString("memRegDate");
				String memModDate = rs.getString("memModDate");
				
				DiaryDto diaryDto = new DiaryDto();
				
				diaryDto.setDiaryNo(diaryNo);
				diaryDto.setDiaryWord(diaryWord);
				diaryDto.setDiaryRegDate(diaryRegDate);
				diaryDto.setDiaryModDate(diaryModDate);
				
				diaryDto.setMemNo(memNo);
				diaryDto.setMemId(memId);
				diaryDto.setMemPw(memPw);
				diaryDto.setMemMail(memMail);
				diaryDto.setMemPhone(memPhone);
				diaryDto.setMemRegDate(memRegDate);
				diaryDto.setMemModDate(memModDate);
				
				diaryDtos.add(diaryDto);
			} // Dto 로 데이터들 옮겨야 하니까 get, set 으로 옮기고 어레이리스트 만들어서 거기다가 add 해준다
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			
			//8. 외부 자원 해제
			
			try {				
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}	
		}
		return diaryDtos;
	}
}