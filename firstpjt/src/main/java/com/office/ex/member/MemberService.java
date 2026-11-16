package com.office.ex.member;

import com.office.ex.Config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MemberService {

	final public static int SIGN_IN_OK = 1;
	final public static int SIGN_IN_NG = 0;
	
	final public static int SIGN_UP_OK = 1;
	final public static int SIGN_UP_NG = 0;
	
	MemberDao memberDao = new MemberDao();
	
	public int signupConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");

		MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
		
		return memberDao.insertNewMember(memberDto);
		
	}

	public int signinConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		MemberDto selectedMemberDto = memberDao.selectMemberByMemIdAndMemPw(memId);
		
		/*
		if (selectedMemberDto != null && selectedMemberDto.getMemPw().equals(memPw)) {
			return SIGN_IN_OK;
		} else {
			return SIGN_IN_NG;
		}
		*/
		
		if (selectedMemberDto != null && selectedMemberDto.getMemPw().equals(memPw)) {
			
			HttpSession session = request.getSession();
			session.setAttribute(Config.SIGNINED_MEMBER_ID, selectedMemberDto.getMemId());
			session.setMaxInactiveInterval(60 * 30); // 30분 마다 세션 초기화
			
			return SIGN_IN_OK;
		}
			
	
		return SIGN_IN_NG;

	}

	public void signoutConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
//		session.removeAttribute(Config.SIGNINED_MEMBER_ID);
		// 위 코드 대신 아래거 써도 된다
		session.invalidate();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
