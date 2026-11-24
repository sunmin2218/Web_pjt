<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <link href="./res/css/include/nav.css" rel="stylesheet" type="text/css">
    
	<nav>
		<div class="nav_wrap">
			<a href="<%= request.getContextPath() %>/">홈</a>
			&nbsp;&nbsp; | &nbsp;&nbsp;
			<a href="<%= request.getContextPath() %>/signin_form.mem">로그인</a>
			&nbsp;&nbsp; | &nbsp;&nbsp;
			<a href="<%= request.getContextPath() %>/signup_form.mem">회원가입</a>
			&nbsp;&nbsp; | &nbsp;&nbsp;
			<a href="<%= request.getContextPath() %>/signout_conform.mem">로그아웃</a>
			&nbsp;&nbsp; | &nbsp;&nbsp;
			<a href="<%= request.getContextPath() %>/injection_registe_form.vac">백신 접종 등록</a>
			&nbsp;&nbsp; | &nbsp;&nbsp;
			<a href="<%= request.getContextPath() %>/injection_registe_list.vac">백신 접종 목록</a>
		</div>
	</nav>