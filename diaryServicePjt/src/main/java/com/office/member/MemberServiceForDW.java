package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberServiceForDW implements IMemberService{
	
	final private IMemberDao iMemberDao;

	public MemberServiceForDW(IMemberDao iMemberDao) {
		this.iMemberDao = iMemberDao;
	}

	@Override
	public int signup(HttpServletRequest request, HttpServletResponse response) {
		
		return 0;
	}

	@Override
	public int signin(HttpServletRequest request, HttpServletResponse response) {
		
		return 0;
	}
	
	
	
	
	
	
	
	
}
