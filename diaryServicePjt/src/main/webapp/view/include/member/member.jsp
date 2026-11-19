<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <script>
        
    function signupForm() {
    	console.log('singupForm()')
    	
    	let form = document.signup_form;
    	if (form.memId.value === '') {
    		alert('Please input new member ID')
    		form.memId.focus();
    	} else if (form.memPw.value === '') {
    		alert('Please input new member PW')
    		form.memPw.focus();
    	} else {
    		form.submit();
    	}
    	
    }
    
    
    </script>