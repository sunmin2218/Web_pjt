<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp" />

<link href="./res/css/member/member.css" rel="stylesheet">

<jsp:include page="../include/js/member.jsp" />

</head>
<body>

	<jsp:include page="../include/header.jsp" />
	
	<jsp:include page="../include/nav.jsp" />
	
	<section>
		<div class="section_wrap">
			
			<h1>SIGNUP FORM</h1>
			
			<form 
				action="<%= request.getContextPath() %>/signup_confirm.mem" 
				method="POST" 
				name="signup_form">
				
				<input class="basic_input" type="text" name="admin_id" placeholder="Input new admin ID">
				<br>
				<input class="basic_input" type="password" name="admin_pw" placeholder="Input new admin PW">
				<br>
				<input class="basic_input" type="password" name="admin_pw_again" placeholder="Again Input new admin PW">
				<br>
				<input class="basic_input" type="email" name="admin_mail" placeholder="Input new admin MAIL">
				<br>
				<input class="basic_input" type="text" name="admin_phone" placeholder="Input new admin PHONE">
				<br>
				<input class="basic_button" type="button" value="SIGN UP" onclick="signupForm();">
				<input class="basic_button" type="reset" value="RESET">
			</form>
			
		</div>
	</section>
	
	<jsp:include page="../include/footer.jsp" />

</body>
</html>