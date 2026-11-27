package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {
	
	final private MemberDao memberDao;
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public int signupConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		// 1. ID 중복 체그
		String admin_id = request.getParameter("admin_id");
		String admin_pw = request.getParameter("admin_pw");
		String admin_mail = request.getParameter("admin_mail");
		String admin_phone = request.getParameter("admin_phone");
		
		boolean isMember = memberDao.isMember(admin_id);
		
		
		int result = 0;
		
		// 2. 회원가입
		if (!isMember) {
			result = memberDao.insertNewMember(
					new MemberDto(admin_id, admin_pw, admin_mail, admin_phone));
			
			if (result > 0) {
				System.out.println("[MemberService] SIGNUP SUCCESS");
			} else {
				System.out.println("[MemberService] SIGNUP FAIL");
			}
			
		} else {
			result = 0;
		}
		
		return result;
	}

	public String signinConfirm(HttpServletRequest request, HttpServletResponse response) {
		String admin_id = request.getParameter("admin_id");
		String admin_pw = request.getParameter("admin_pw");
		
		MemberDto selectedMemberDto = memberDao.selectMemberByAdminId(admin_id);
		
		if (selectedMemberDto != null && selectedMemberDto.getAdmin_pw().equals(admin_pw)) {
			
			 
				System.out.println("[MemberService] SIGNIN SUCCESS");
				
				
				return admin_id;
				
				
			} 
		
		return null;
	
	}

}
