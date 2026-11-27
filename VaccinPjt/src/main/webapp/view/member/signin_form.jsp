<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<jsp:include page="../include/title.jsp"></jsp:include>
	
	<link href="./res/css/member/member.css" rel="stylesheet" type="text/css"> 
	
	<jsp:include page="../include/js/member.jsp"></jsp:include>
	
</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	
	<jsp:include page="../include/nav.jsp"></jsp:include>
	
	<section>
		<div class="section_wrap">
			
			<h1>SIGNIN FORM</h1>
			
			<form action="<%= request.getContextPath() %>/signin_confirm.mem" method="post" name="signin_form">
				
				<input class="basic_input" type="text" name="admin_id" placeholder="input admin ID">
				<br>
				<input class="basic_input" type="password" name="admin_pw" placeholder="input admin PW">
				<br>
				<input class="basic_button" type="button" value="SIGN IN" onclick="signinForm();">
				<input class="basic_button" type="reset" value="RESET">
				
				
			</form>
			
		</div>
	</section>
	
	<jsp:include page="../include/footer.jsp"></jsp:include>
	
</body>
</html>