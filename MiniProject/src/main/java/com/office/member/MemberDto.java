package com.office.member;

public class MemberDto {
	
	private int member_no;
	private String member_id;
	private String member_pw;
	private String member_mail;
	private String member_phone;
	private String member_reg_date;
	private String member_mod_date;
	
	public MemberDto(int member_no, String member_id, String member_pw, String member_mail, String member_phone,
			String member_reg_date, String member_mod_date) {
		this.member_no = member_no;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_mail = member_mail;
		this.member_phone = member_phone;
		this.member_reg_date = member_reg_date;
		this.member_mod_date = member_mod_date;
	}
	
	public MemberDto(String member_id, String member_pw, String member_mail, String member_phone) {
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_mail = member_mail;
		this.member_phone = member_phone;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_mail() {
		return member_mail;
	}

	public void setMember_mail(String member_mail) {
		this.member_mail = member_mail;
	}

	public String getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}

	public String getMember_reg_date() {
		return member_reg_date;
	}

	public void setMember_reg_date(String member_reg_date) {
		this.member_reg_date = member_reg_date;
	}

	public String getMember_mod_date() {
		return member_mod_date;
	}

	public void setMember_mod_date(String member_mod_date) {
		this.member_mod_date = member_mod_date;
	}
	
	
	
	
	
	
	
	

}
