package com.office.diary;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DiaryService {
	
	final private DiaryDao diaryDao;
	
	public DiaryService(DiaryDao diaryDao) {
		this.diaryDao = diaryDao;
	}

	public int writeNewDiary(HttpServletRequest request, HttpServletResponse response) {
		
		String diaryWord = request.getParameter("diaryWord");
		HttpSession session = request.getSession();
		String signinedMemberId = String.valueOf(session.getAttribute("signinedMemberId"));
		
		DiaryDto diaryDto = new DiaryDto(diaryWord, signinedMemberId);
		
		int result = diaryDao.insertNewDiary(diaryDto);
		
		return result;
	}
	
}
