package com.office.ex;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.mem") // .mem 으로 url 맵핑
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberController() {
    }

    
    // /firstpjt/signup.mem 인덱스제이에스피 에서 이렇게 요청
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length()); 

		MemberService memberService = null;
		String nextPage = null;
		
		switch (command) {
		case "/signup.mem":
			nextPage = "view/member/signup_form.jsp";
			break;
		
		case "signup_confirm.mem":
			memberService = new MemberService();
			
			int resultForSignUp = memberService.signupConfirm(request, response);
			
			if (resultForSignUp == 1) {
				nextPage = "view/member/signup_ok.jsp";
			} else {
				nextPage = "view/member/signup_ng.jsp";
			}
			
			break;
			
			
		case "/signin.mem":
			
			break;
		}
		
		// 디스팻쳐 - 엄청 중요하지만 따로 배울 필요는 없다 () 안에 타겟 페이지를 넣어야 한다
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(nextPage);
		requestDispatcher.forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
