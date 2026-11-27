<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <link href="./res/css/include/nav.css" rel="stylesheet" type="text/css">
    
	<nav>
		<div class="nav_wrap">
			<a href="<%= request.getContextPath() %>/">홈</a>
			&nbsp;&nbsp; | &nbsp;&nbsp;
			
			<c:choose>
				
				<c:when test="${empty sessionScope.signinedAdminId}">
					<a href="${pageContext.request.contextPath}/signin_form.mem">로그인</a>
					&nbsp;&nbsp; | &nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/signup_form.mem">회원가입</a>
					&nbsp;&nbsp; | &nbsp;&nbsp;	
				</c:when>
				
				
				<c:otherwise>
					<a href="${pageContext.request.contextPath}/signout_conform.mem">로그아웃</a>
					&nbsp;&nbsp; | &nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/injection_registe_form.vac">백신 접종 등록</a>
					&nbsp;&nbsp; | &nbsp;&nbsp;
					<a href="${pageContext.request.contextPath}/injection_list.vac">백신 접종 목록</a>
				</c:otherwise>
				
			</c:choose>
			
			
			
			
			
			
		</div>
	</nav>