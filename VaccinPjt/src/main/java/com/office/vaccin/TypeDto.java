package com.office.vaccin;

public class TypeDto {
	
	private int fv_type_no;
	private String fv_type;
	private String fv_type_manuf_country;
	private String fv_type_manuf_date;
	
	
	public TypeDto(int fv_type_no, String fv_type, String fv_type_manuf_country, String fv_type_manuf_date) {
		this.fv_type_no = fv_type_no;
		this.fv_type = fv_type;
		this.fv_type_manuf_country = fv_type_manuf_country;
		this.fv_type_manuf_date = fv_type_manuf_date;
	}
	
	public int getFv_type_no() {
		return fv_type_no;
	}
	public void setFv_type_no(int fv_type_no) {
		this.fv_type_no = fv_type_no;
	}
	public String getFv_type() {
		return fv_type;
	}
	public void setFv_type(String fv_type) {
		this.fv_type = fv_type;
	}
	public String getFv_type_manuf_country() {
		return fv_type_manuf_country;
	}
	public void setFv_type_manuf_country(String fv_type_manuf_country) {
		this.fv_type_manuf_country = fv_type_manuf_country;
	}
	public String getFv_type_manuf_date() {
		return fv_type_manuf_date;
	}
	public void setFv_type_manuf_date(String fv_type_manuf_date) {
		this.fv_type_manuf_date = fv_type_manuf_date;
	}
	
	
	
	
	
	

}
