package com.testinium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.ExamGradeAndAvarageAllStudentsResponse;
import com.testinium.service.business.BusinessStudentService;

@RestController
@RequestScope
@RequestMapping("/student")
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


	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public AddStudentResponse addStudent(
			@RequestBody AddStudentRequest request) {
		return businessStudentService.createStudent(request);
	}
//
//	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//	public String addStudent(
//			@RequestBody AddStudentRequest request) {
//		System.out.println(request);
//		 var c=businessStudentService.createStudent2(request);
//		return "okeyyyyy";
//	}

	@GetMapping("{year,lessonCode}")
	public ExamGradeAndAvarageAllStudentsResponse  getExamGradeAndAvarageAllStudents(
			@RequestParam(required = true) String year,@RequestParam(required = true) String lessonCode) {
		
		return businessStudentService.getAllStudentsByYearAndLessonCode(year,lessonCode);
	}
}
