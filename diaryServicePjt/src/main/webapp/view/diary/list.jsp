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
        		<%
	        		List<DiaryDto> myDiaries = (List<DiaryDto>) request.getAttribute("myDiaries");
	        	    for (int i = 0; i < myDiaries.size(); i++) {
	        	%>
	        		<tr>
	        			<td><%= myDiaries.get(i).getDiaryNo() %></td>
	        			<td><%= myDiaries.get(i).getDiaryWord() %></td>
	        			<td><%= myDiaries.get(i).getDiaryRegDate() %></td>
	        			<td><%= myDiaries.get(i).getDiaryModDate() %></td>
	        			<td><%= myDiaries.get(i).getMemNo() %></td>
	        			<td><%= myDiaries.get(i).getMemId() %></td>
	        			<td><%= myDiaries.get(i).getMemPw() %></td>
	        			<td><%= myDiaries.get(i).getMemMail() %></td>
	        			<td><%= myDiaries.get(i).getMemPhone() %></td>
	        			<td><%= myDiaries.get(i).getMemRegDate() %></td>
	        			<td><%= myDiaries.get(i).getMemModDate() %></td>
	        		</tr>
	        	<%
	        	    }
        		%>
        		
	        		
        		</tbody>
        	</table>    
            
        </div>
    </article>
    
    <jsp:include page="../include/footer.jsp"></jsp:include>
    
</body>
</html>