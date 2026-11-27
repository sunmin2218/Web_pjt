<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<jsp:include page="../include/title.jsp"></jsp:include>
	
	<link href="./res/css/vaccin/vaccin.css" rel="stylesheet" type="text/css"> 
	
	<jsp:include page="../include/js/vaccin.jsp"></jsp:include>
	
</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	
	<jsp:include page="../include/nav.jsp"></jsp:include>
	
	<section>
		<div class="section_wrap">
			
			<h1>MODIFY FORM</h1>
				
			<form 
				action="<%=request.getContextPath() %>/injection_modify_confirm.vac" 
				method="POST" 
				name="modify_form">
				
				<input type="hidden" name="fvp_no" value="${selectVaccinDto.fvp_no}">
				<br>
				<input class="basic_input" type="text" name="fvp_name" value="${selectVaccinDto.fvp_name}" placeholder="input_name">
				<br>
				<select class="basic_select" name="ss_number">
					<option value="">-- 선택 --</option>
					<option value="720520-1018547" 
						<c:if test="${selectVaccinDto.ss_number eq '720520-1018547'}">selected</c:if>>720520-1******</option>
					<option value="710210-2084561"
						<c:if test="${selectVaccinDto.ss_number eq '710210-2084561'}">selected</c:if>>710210-2******</option>
					<option value="941230-1075214"
						<c:if test="${selectVaccinDto.ss_number eq '941230-1075214'}">selected</c:if>>941230-1******</option>
					<option value="650215-2050128"
						<c:if test="${selectVaccinDto.ss_number eq '650215-2050128'}">selected</c:if>>650215-2******</option>
					<option value="800710-1025698"
						<c:if test="${selectVaccinDto.ss_number eq '800710-1025698'}">selected</c:if>>800710-1******</option>
				</select>
				<br>
				<input class="basic_input" type="email" name="fvp_mail" value="${selectVaccinDto.fvp_mail}" placeholder="input mail">
				<br>
				<input class="basic_input" type="text" name="fvp_phone" value="${selectVaccinDto.fvp_phone}" placeholder="input phone">
				<br>
				<select class="basic_select" name="fv_location_no">
					<option value="">-- 선택 --</option>
					<option value="1001" <c:if test="${selectedVaccinDto.fv_location_no eq '1001'}">selected</c:if>>A접종처</option>
					<option value="1002" <c:if test="${selectedVaccinDto.fv_location_no eq '1002'}">selected</c:if>>B접종처</option>
					<option value="1003" <c:if test="${selectedVaccinDto.fv_location_no eq '1003'}">selected</c:if>>C접종처</option>
					<option value="1004" <c:if test="${selectedVaccinDto.fv_location_no eq '1004'}">selected</c:if>>D접종처</option>		
					<option value="1005" <c:if test="${selectedVaccinDto.fv_location_no eq '1005'}">selected</c:if>>E접종처</option>	
				</select>
				<br>
				<select class="basic_select" name="fv_type">
					<option value="">-- 선택 --</option>
					<option value="A" <c:if test="${selectedVaccinDto.fv_type eq 'A'}">selected</c:if>>A</option>
					<option value="B" <c:if test="${selectedVaccinDto.fv_type eq 'B'}">selected</c:if>>B</option>
					<option value="C" <c:if test="${selectedVaccinDto.fv_type eq 'C'}">selected</c:if>>C</option>
					<option value="D" <c:if test="${selectedVaccinDto.fv_type eq 'D'}">selected</c:if>>D</option>
					<option value="E" <c:if test="${selectedVaccinDto.fv_type eq 'E'}">selected</c:if>>E</option>
				</select>
				<br>
				<input class="basic_button" type="button" value="MODIFY" onclick="modifyForm()">
				<input class="basic_button" type="reset" value="RESET">
			</form>
		</div>
	</section>
	
	<jsp:include page="../include/footer.jsp"></jsp:include>
	
</body>
</html>