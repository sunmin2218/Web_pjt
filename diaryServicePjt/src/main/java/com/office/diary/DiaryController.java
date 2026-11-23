package com.office.diary;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("*.dir")
public class DiaryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DiaryController() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		DiaryService diaryService = null;
		String nextPage = null;
		
		switch(command) {
		case "/diary_write_form.dir":
			
			nextPage = generateView("write_form");
			
			break;
			
		case "/write_confirm.dir":
			
			diaryService = new DiaryService(new DiaryDao());
			int resultForWrite = diaryService.writeNewDiary(request, response);
			
			if (resultForWrite > 0) {
				nextPage = generateView("write_ok");
			} else {
				nextPage = generateView("write_ng");
			}
			
			break;
			
			
			
		case "/diary_list.dir":
			
			diaryService = new DiaryService(new DiaryDao());
			List<DiaryDto> myDiaries = diaryService.getMyDiaries(request, response);
			
			nextPage = generateView("list");
			
			break;	
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
		
	}
		
		
		private String generateView(String viewName) {
			return "view/diary/" + viewName + ".jsp";
	}
}


