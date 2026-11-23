package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface IMemberService {
	
	public int signup(HttpServletRequest request, HttpServletResponse response);
	
	public MemberDto signin(HttpServletRequest request, HttpServletResponse response);

}
