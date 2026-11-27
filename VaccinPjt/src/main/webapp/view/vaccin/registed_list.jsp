<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<jsp:include page="../include/title.jsp"></jsp:include>
	
	<link href="./res/css/vaccin/vaccin.css" rel="stylesheet"> 
	
	<jsp:include page="../include/js/vaccin.jsp"></jsp:include>
	
</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	
	<jsp:include page="../include/nav.jsp"></jsp:include>
	
	<section>
		<div class="section_wrap">
			
			<h1>REGISTED LIST</h1>
			
			<table class="list">
				<thead>
					<tr>
						<th>NO</th>
						<th>NAME</th>
						<th>MAIL</th>
						<th>PHONE</th>
						<th>S_NUM</th>
						<th>S_NAM</th>
						<th>S_ADD</th>
						<th>S_PHO</th>
						<th>L_NO</th>
						<th>L_NAME</th>
						<th>L_ADDR</th>
						<th>L_MANAGER</th>
						<th>T</th>
						<th>T_NO</th>
						<th>T_M_CTRY</th>
						<th>T_M_DATE</th>
						<th>REG_DATE</th>
						<th>수정</th>
					</tr>
				</thead>
				
				<tbody>
				
					<c:forEach var="item" items="${vaccinDtos}">
						<tr>
							<td>${item.fvp_no}</td>
							<td>${item.fvp_name}</td>
							<td>${item.fvp_mail}</td>
							<td>${item.fvp_phone}</td>
							<td>${item.socialNumberDto.ss_number}</td>
							<td>${item.socialNumberDto.ss_name}</td>
							<td>${item.socialNumberDto.ss_addr}</td>
							<td>${item.socialNumberDto.ss_phone}</td>
							<td>${item.locationDto.fv_location_no}</td>
							<td>${item.locationDto.fv_location_name}</td>
							<td>${item.locationDto.fv_location_addr}</td>
							<td>${item.locationDto.fv_location_manager}</td>
							<td>${item.typeDto.fv_type}</td>
							<td>${item.typeDto.fv_type_no}</td>
							<td>${item.typeDto.fv_type_manuf_country}</td>
							<td>${item.typeDto.fv_type_manuf_date}</td>
							<td>${item.fvp_reg_date}</td>
							<td>
								<a href="<%= request.getContextPath() %>/injection_modify.vac?fvp_no=${item.fvp_no}">수정</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</section>
	
	<jsp:include page="../include/footer.jsp"></jsp:include>
	
</body>
</html>