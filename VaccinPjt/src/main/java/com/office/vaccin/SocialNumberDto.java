package com.office.vaccin;

public class SocialNumberDto {
	
	private String ss_number;
	private String ss_name;
	private String ss_addr;
	private String ss_phone;
	private String ss_reg_date;
	

	public SocialNumberDto(String ss_number, String ss_name, String ss_addr, String ss_phone, String ss_reg_date) {
		this.ss_number = ss_number;
		this.ss_name = ss_name;
		this.ss_addr = ss_addr;
		this.ss_phone = ss_phone;
		this.ss_reg_date = ss_reg_date;
	}
	

	public String getSs_number() {
		return ss_number;
	}

	public void setSs_number(String ss_number) {
		this.ss_number = ss_number;
	}

	public String getSs_name() {
		return ss_name;
	}

	public void setSs_name(String ss_name) {
		this.ss_name = ss_name;
	}

	public String getSs_addr() {
		return ss_addr;
	}

	public void setSs_addr(String ss_addr) {
		this.ss_addr = ss_addr;
	}

	public String getSs_phone() {
		return ss_phone;
	}

	public void setSs_phone(String ss_phone) {
		this.ss_phone = ss_phone;
	}

	public String getSs_reg_date() {
		return ss_reg_date;
	}

	public void setSs_reg_date(String ss_reg_date) {
		this.ss_reg_date = ss_reg_date;
	}

	
	
	
	
	
	
	
	
	
	
	

}
