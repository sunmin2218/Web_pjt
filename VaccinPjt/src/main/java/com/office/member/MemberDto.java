package com.office.member;

public class MemberDto {
	
	
	private int admin_no;      
	private String admin_id;      
	private String admin_pw;    
	private String admin_mail; 
	private String admin_phone;   
	private String admin_reg_date;
	private String admin_mod_date;
	
	public MemberDto() {
		
	}

	public MemberDto(int admin_no, String admin_id, String admin_pw, String admin_mail, String admin_phone,
			String admin_reg_date, String admin_mod_date) {
		super();
		this.admin_no = admin_no;
		this.admin_id = admin_id;
		this.admin_pw = admin_pw;
		this.admin_mail = admin_mail;
		this.admin_phone = admin_phone;
		this.admin_reg_date = admin_reg_date;
		this.admin_mod_date = admin_mod_date;
	}
	
	public MemberDto(String admin_id, String admin_pw, String admin_mail, String admin_phone) {


		this.admin_id = admin_id;
		this.admin_pw = admin_pw;
		this.admin_mail = admin_mail;
		this.admin_phone = admin_phone;

	}

	public int getAdmin_no() {
		return admin_no;
	}

	public void setAdmin_no(int admin_no) {
		this.admin_no = admin_no;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_pw() {
		return admin_pw;
	}

	public void setAdmin_pw(String admin_pw) {
		this.admin_pw = admin_pw;
	}

	public String getAdmin_mail() {
		return admin_mail;
	}

	public void setAdmin_mail(String admin_mail) {
		this.admin_mail = admin_mail;
	}

	public String getAdmin_phone() {
		return admin_phone;
	}

	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}

	public String getAdmin_reg_date() {
		return admin_reg_date;
	}

	public void setAdmin_reg_date(String admin_reg_date) {
		this.admin_reg_date = admin_reg_date;
	}

	public String getAdmin_mod_date() {
		return admin_mod_date;
	}

	public void setAdmin_mod_date(String admin_mod_date) {
		this.admin_mod_date = admin_mod_date;
	}
	
	
	
	
	
	
	
	
	
}
