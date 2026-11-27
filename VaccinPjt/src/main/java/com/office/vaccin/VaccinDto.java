package com.office.vaccin;

public class VaccinDto {
	
	private int fvp_no;
	private String fvp_name;
	private String ss_number;
	private String fvp_mail;
	private String fvp_phone;
	private int fv_location_no;
	private String fv_type;
	private String fvp_reg_date;
	
	private SocialNumberDto socialNumberDto;
	private LocationDto locationDto;
	private TypeDto typeDto;
	
	
	public VaccinDto() {
		
	}

	public VaccinDto(int fvp_no, String fvp_name, String ss_number, String fvp_mail, String fvp_phone,
			int fv_location_no, String fv_type, String fvp_reg_date) {
		this.fvp_no = fvp_no;
		this.fvp_name = fvp_name;
		this.ss_number = ss_number;
		this.fvp_mail = fvp_mail;
		this.fvp_phone = fvp_phone;
		this.fv_location_no = fv_location_no;
		this.fv_type = fv_type;
		this.fvp_reg_date = fvp_reg_date;
	}
	
	public VaccinDto(String fvp_name, String ss_number, String fvp_mail, String fvp_phone,
			int fv_location_no, String fv_type) {
		this.fvp_name = fvp_name;
		this.ss_number = ss_number;
		this.fvp_mail = fvp_mail;
		this.fvp_phone = fvp_phone;
		this.fv_location_no = fv_location_no;
		this.fv_type = fv_type;
	}

	public int getFvp_no() {
		return fvp_no;
	}

	public void setFvp_no(int fvp_no) {
		this.fvp_no = fvp_no;
	}

	public String getFvp_name() {
		return fvp_name;
	}

	public void setFvp_name(String fvp_name) {
		this.fvp_name = fvp_name;
	}

	public String getSs_number() {
		return ss_number;
	}

	public void setSs_number(String ss_number) {
		this.ss_number = ss_number;
	}

	public String getFvp_mail() {
		return fvp_mail;
	}

	public void setFvp_mail(String fvp_mail) {
		this.fvp_mail = fvp_mail;
	}

	public String getFvp_phone() {
		return fvp_phone;
	}

	public void setFvp_phone(String fvp_phone) {
		this.fvp_phone = fvp_phone;
	}

	public int getFv_location_no() {
		return fv_location_no;
	}

	public void setFv_location_no(int fv_location_no) {
		this.fv_location_no = fv_location_no;
	}

	public String getFv_type() {
		return fv_type;
	}

	public void setFv_type(String fv_type) {
		this.fv_type = fv_type;
	}

	public String getFvp_reg_date() {
		return fvp_reg_date;
	}

	public void setFvp_reg_date(String fvp_reg_date) {
		this.fvp_reg_date = fvp_reg_date;
	}

	public SocialNumberDto getSocialNumberDto() {
		return socialNumberDto;
	}

	public void setSocialNumberDto(SocialNumberDto socialNumberDto) {
		this.socialNumberDto = socialNumberDto;
	}

	public LocationDto getLocationDto() {
		return locationDto;
	}

	public void setLocationDto(LocationDto locationDto) {
		this.locationDto = locationDto;
	}

	public TypeDto getTypeDto() {
		return typeDto;
	}

	public void setTypeDto(TypeDto typeDto) {
		this.typeDto = typeDto;
	}	
	
	
	
	
}
