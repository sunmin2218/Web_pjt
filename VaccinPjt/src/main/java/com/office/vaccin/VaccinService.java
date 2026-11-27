package com.office.vaccin;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VaccinService {
	
	final private VaccinDao vaccinDao;
	
	public VaccinService(VaccinDao vaccinDao) {
		this.vaccinDao = vaccinDao;
	}

	public int registeConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		String fvp_name = request.getParameter("fvp_name");
		String ss_number = request.getParameter("ss_number");
		String fvp_mail = request.getParameter("fvp_mail");
		String fvp_phone = request.getParameter("fvp_phone");
		int fv_location_no = Integer.parseInt(request.getParameter("fv_location_no"));
		String fv_type = request.getParameter("fv_type");
		
		VaccinDto vaccinDto = new VaccinDto(
				fvp_name, 
				ss_number, 
				fvp_mail, 
				fvp_phone, 
				fv_location_no, 
				fv_type);
		
		int result = vaccinDao.insertNewRegiste(vaccinDto);
				
		if (result > 0) {
			System.out.println("[VaccinService] REGISTE SUCCESS!!");
			
		} else {
			System.out.println("[VaccinService] REGISTE FAIL!!");
			
		}
		
		
		request.setAttribute("resultForRegist", result);
		
		return result;
	}

	public void listup(HttpServletRequest request, HttpServletResponse response) {
		
		List<VaccinDto> vaccinDtos = vaccinDao.selectRegistedPerson();
		
		request.setAttribute("vaccinDtos", vaccinDtos);
		
	}

	public void selectVaccinDto(HttpServletRequest request, HttpServletResponse response) {
		
		int fvp_no = Integer.parseInt(request.getParameter("fvp_no"));
		
		VaccinDto selectVaccinDto = vaccinDao.selectVaccinDtoByFvpNo(fvp_no);
		
		request.setAttribute("selectVaccinDto", selectVaccinDto);
		
	}

	public int modify(HttpServletRequest request, HttpServletResponse response) {
		
		int fvp_no = Integer.parseInt(request.getParameter("fvp_no"));
		
		String fvp_name = request.getParameter("fvp_name");
		String ss_number = request.getParameter("ss_number");
		String fvp_mail = request.getParameter("fvp_mail");
		String fvp_phone = request.getParameter("fvp_phone");
		int fv_location_no = Integer.parseInt(request.getParameter("fv_location_no"));
		String fv_type = request.getParameter("fv_type");
		
		VaccinDto vaccinDto = new VaccinDto(
				fvp_name, 
				ss_number, 
				fvp_mail, 
				fvp_phone, 
				fv_location_no, 
				fv_type);
		
		vaccinDto.setFvp_no(fvp_no);
		
		int result = vaccinDao.update(vaccinDto);
		
		if (result > 0) {
			System.out.println("[VaccinService] MODIFY SUCCESS");
		} else {
			System.out.println("[VaccinService] MODIFY FAIL");
		}
		
		return result;
	}

}
