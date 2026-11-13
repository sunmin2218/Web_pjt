<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h2>SIGN-UP FORM</h2>
    
    <a href="/firstpjt/">home</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="/firstpjt/signup.mem">sign-up</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="/firstpjt/signup.mem">sign-in</a>
    
    
    <br><br>
    <form action="/firstpjt/signup_confirm.mem" method="post">
        <input type="text" name="memId" placeholder="Input new member ID">
        <br>
        <input type="password" name="memPw" placeholder="Input new member PW">
        <br>
        <input type="email" name="memMail" placeholder="Input new member MAIL">
        <br>
        <input type="text" name="memPhone" placeholder="Input new member PHONE">
        <input type="submit" value="SIGNUP">
        <input type="reset" value="RESET">
        
    </form>
    
    
    
    
    
</body>
</html>