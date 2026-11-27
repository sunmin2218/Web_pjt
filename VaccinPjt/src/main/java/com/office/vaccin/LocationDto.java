package com.office.vaccin;

public class LocationDto {
	
	private int fv_location_no;
	private String fv_location_name;
	private String fv_location_addr;
	private String fv_location_phone;
	private String fv_location_manager;
	
	
	public LocationDto(int fv_location_no, String fv_location_name, String fv_location_addr, String fv_location_phone,
			String fv_location_manager) {
		this.fv_location_no = fv_location_no;
		this.fv_location_name = fv_location_name;
		this.fv_location_addr = fv_location_addr;
		this.fv_location_phone = fv_location_phone;
		this.fv_location_manager = fv_location_manager;
	}


	public int getFv_location_no() {
		return fv_location_no;
	}


	public void setFv_location_no(int fv_location_no) {
		this.fv_location_no = fv_location_no;
	}


	public String getFv_location_name() {
		return fv_location_name;
	}


	public void setFv_location_name(String fv_location_name) {
		this.fv_location_name = fv_location_name;
	}


	public String getFv_location_addr() {
		return fv_location_addr;
	}


	public void setFv_location_addr(String fv_location_addr) {
		this.fv_location_addr = fv_location_addr;
	}


	public String getFv_location_phone() {
		return fv_location_phone;
	}


	public void setFv_location_phone(String fv_location_phone) {
		this.fv_location_phone = fv_location_phone;
	}


	public String getFv_location_manager() {
		return fv_location_manager;
	}


	public void setFv_location_manager(String fv_location_manager) {
		this.fv_location_manager = fv_location_manager;
	}
	
	
	
	
	
	
	
	
	

}
