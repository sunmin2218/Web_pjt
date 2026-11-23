package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberServiceForDW implements IMemberService {

	final private IMemberDao memberDao;
	
	public MemberServiceForDW(IMemberDao memberDao) {
		this.memberDao = memberDao;
		
	}

	@Override
	public int signup(HttpServletRequest request, HttpServletResponse response) {
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");
		
		MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
		
		boolean isMember = memberDao.isMember(memId);
		int result = 0;
		if (!isMember) {
			result = memberDao.insertNewMember(memberDto);
			
		}
		
		return result;
		
	}

	@Override
	public MemberDto signin(HttpServletRequest request, HttpServletResponse response) {
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		MemberDto selectedMemberDto = memberDao.selectMemberByMemId(memId);
		
		if (selectedMemberDto != null) {
			System.out.println("[MemberService] selectedMemberDto is not null");
			
			if (selectedMemberDto.getMemPw().equals(memPw)) {
				System.out.println("[MemberService] signin SUCCESS");
				
				return selectedMemberDto;
				
			} else {
				System.out.println("[MemberService] signin FAIL");
				
				return null;
				
			}
		} else {
			System.out.println("[MemberService] selectedMemberDto is null");
			System.out.println("[MemberService] signin FAIL");
			
			return null;
			
			
		}
		
	}
	
	
	
}