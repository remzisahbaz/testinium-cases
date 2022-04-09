package com.testinium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.entity.Student;
import com.testinium.service.business.BusinessStudentService;

@RestController
@RequestScope
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

	@Autowired
	private BusinessStudentService businessStudentService;

	
	/**
	 * @param businessStudentService
	 */
	public StudentController(BusinessStudentService businessStudentService) {
		this.businessStudentService = businessStudentService;
	}


//	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//	public AddStudentResponse addStudent(
//			@RequestBody AddStudentRequest request) {
//		return businessStudentService.createStudent(request);
//	}
//
//	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//	public String addStudent(
//			@RequestBody AddStudentRequest request) {
//		System.out.println(request);
//		 var c=businessStudentService.createStudent2(request);
//		return "okeyyyyy";
//	}

//	@GetMapping("{year,lessonCode}")
//	public ExamGradeAndAvarageAllStudentsResponse  getExamGradeAndAvarageAllStudents(
//			@RequestParam(required = true) String year,@RequestParam(required = true) String lessonCode) {
//		
//		return businessStudentService.getAllStudentsByYearAndLessonCode(year,lessonCode);
//	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> addStudent(
			@RequestBody Student request) {
		var newStudent=businessStudentService.createStudent3(request);
		
		return new ResponseEntity<>(request,HttpStatus.CREATED);
	}
}
