/**
 * 
 */
package com.testinium.controller;

import java.net.http.HttpRequest;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.entity.Student;
import com.testinium.service.business.StudentServiceBusiness;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@RestController
@RequestScope
@RequestMapping("/")
@CrossOrigin
public class RestFulController {

	@Autowired
	private StudentServiceBusiness studentServiceBusiness;
	
	/**
	 * @param studentServiceBusiness
	 */
	public RestFulController(StudentServiceBusiness studentServiceBusiness) {
		this.studentServiceBusiness = studentServiceBusiness;
	}

	@PostMapping(value = "students", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student createUser(@RequestBody Student student) throws Exception {
		System.out.println(student);
		//Objects.nonNull(student);
		return studentServiceBusiness.createStudent(student).orElseThrow(()->new Exception("ekleme Hata"));
	}
}
