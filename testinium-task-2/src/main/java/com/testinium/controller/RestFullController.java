package com.testinium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.service.business.BusinessStudentService;

@RestController
@RequestScope
@RequestMapping("/students")
@CrossOrigin
public class RestFullController {

	@Autowired
	private BusinessStudentService businessStudentService;

	
	/**
	 * @param businessStudentService
	 */
	public RestFullController(BusinessStudentService businessStudentService) {
		this.businessStudentService = businessStudentService;
	}


	@PostMapping
	public AddStudentResponse addStudent(
			@RequestBody AddStudentRequest request) {
		return businessStudentService.createStudent(request);
	}

}
