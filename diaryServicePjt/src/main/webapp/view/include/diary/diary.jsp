<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <script>
        const writeForm = () => {
        	console.log("writeForm()");
        	
        	let form = document.write_form;
        	if (form.diaryWord.value === '') {
        		alert("please input diary");
        		form.diaryWord.focus();
        		
        	} else {
        		form.submit();
        	}
        	
        }    
        
        
        
    </script>