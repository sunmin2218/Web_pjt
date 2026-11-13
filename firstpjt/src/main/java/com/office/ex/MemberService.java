package com.office.ex;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {

	MemberDao memberDao = new MemberDao();
	
	public int signupConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");
		
		
		MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
		
		int result = memberDao.insertNewMemberDao(memberDto);
		
		return result;
	}

}
