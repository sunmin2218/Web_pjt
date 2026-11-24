<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.office.diary.DiaryDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp"></jsp:include>

<link href="./res/css/member/signup_form.css" rel="stylesheet" type="text/css">

<jsp:include page="../include/diary/diary.jsp" />


</head>
<body>
    
    <jsp:include page="../include/header.jsp"></jsp:include>
    
    <jsp:include page="../include/nav.jsp" />
    
    <article>
        <div class="article_wrap">
        
        	<h3>THIS PAGE IS MY DIARIES</h3>
        	
        	<table border="1">
        		<thead>
        			<tr>
        				<th>diaryNo</th>
        				<th>diaryWord</th>
        				<th>diaryRegDate</th>
        				<th>diaryModDate</th>
        				<th>memNo</th>
        				<th>memId</th>
        				<th>memPw</th>
        				<th>memMail</th>
        				<th>memPhone</th>
        				<th>memRegDate</th>
        				<th>memModDate</th>
        			</tr>
        		</thead>
        	
        		<tbody>
        		
        		    <c:forEach var="item" items="${myDiaries}">
        		    	<tr>
		        			<td>${item.diaryNo}</td>
		        			<td>${item.diaryWord}</td>
		        			<td>${item.diaryRegDate}</td>
		        			<td>${item.diaryModDate}</td>
		        			<td>${item.memNo}</td>
		        			<td>${item.memId}</td>
		        			<td>${item.memPw}</td>
		        			<td>${item.memMail}</td>
		        			<td>${item.memPhone}</td>
		        			<td>${item.memRegDate}</td>
		        			<td>${item.memModDate}</td>
		        		</tr>
        		    </c:forEach>
        		
        		
	        		
        		</tbody>
        	</table>    
            
        </div>
    </article>
    
    <jsp:include page="../include/footer.jsp"></jsp:include>
    
</body>
</html>