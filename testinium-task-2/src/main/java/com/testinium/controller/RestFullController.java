package com.testinium.controller;

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

@RestController
@RequestScope
@RequestMapping("/students")
@CrossOrigin
public class RestFullController {

	@PostMapping
	public AddStudentResponse addStudent(
			@RequestBody AddStudentRequest request) {
		return businessStudentService.createStudent(request);
	}
}
