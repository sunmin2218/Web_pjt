<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <script>
    
    	alert("MODIFY SUCCESS");
    	
    	// 여기서 모디파이 오케이냐 앤쥐냐 분기태울 수 있다
    	
    	location.href = "<%= request.getContextPath() %>/injection_list.vac";
    	
    </script>