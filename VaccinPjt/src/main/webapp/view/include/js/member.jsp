<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	const signupForm = () => {
		console.log("signupForm() CALLED!!");
		
		let form = document.signup_form;
		if (form.admin_id.value === '') {
			alert('Input new admin ID!!');
			form.admin_id.focus();
			
		} else if (form.admin_pw.value === '') {
			alert('Input new admin PW!!');
			form.admin_pw.focus();
			
		} else if (form.admin_pw_again.value === '') {
			alert('Again Input new admin PW!!');
			form.admin_pw_again.focus();
			
		} else if (form.admin_pw.value !== form.admin_pw_again.value) {
			alert('Check admin password!!');
			form.admin_pw.value = '';
			form.admin_pw_again.value = '';
			form.admin_pw.focus();
			
		} else if (form.admin_mail.value === '') {
			alert('Input new admin MAIL!!');
			form.admin_mail.focus();
			
		} else if (form.admin_phone.value === '') {
			alert('Input new admin PHONE!!');
			form.admin_phone.focus();
			
		} else {
			form.submit();
			
		}
		
	} 
	
	
	const signinForm = () => {
		console.log("signinForm() CALLED!!");
		
		let form = document.signin_form;
		if (form.admin_id.value === '') {
			alert('Input admin ID!!');
			form.admin_id.focus();
			
		} else if (form.admin_pw.value === '') {
			alert('Input admin PW!!');
			form.admin_pw.focus();
			
		} else {
			form.submit();
			
		}
		
	} 
	
	
	
</script>