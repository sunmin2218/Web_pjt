<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp"></jsp:include>

<link href="./res/css/member/signup_form.css" rel="stylesheet" type="text/css">

<jsp:include page="../include/diary/diary.jsp"></jsp:include>


</head>
<body>
    
    <jsp:include page="../include/header.jsp"></jsp:include>
    
    <jsp:include page="../include/nav.jsp"></jsp:include>
    
    <article>
        <div class="article_wrap">
                
            <form 
            action="<%= request.getContextPath() %>/write_confirm.dir" 
            name="write_form" 
            method="post">
            
            <input class="basic_input" type="text" name="diaryWord" placeholder="input diary">
            <br>
            <input class="basic_input_button" type="button" value="WRITE" onclick="writeForm();">
            <input class="basic_input_button" type="button" value="RESET">
            
            </form>
            
            
            
            
        </div>
    </article>
    
    <jsp:include page="../include/footer.jsp"></jsp:include>
    
    
    
    
    
    
    
</body>
</html>