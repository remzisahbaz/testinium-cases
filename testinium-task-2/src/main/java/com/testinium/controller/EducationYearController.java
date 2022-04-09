package com.testinium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.entity.EducationYear;
import com.testinium.exception.ResourceNotFoundException;
import com.testinium.service.business.BusinessEducationYearService;
import com.testinium.service.business.BusinessStudentService;

@RestController
@RequestScope
@RequestMapping("/students/{identity}/educationyears")
@CrossOrigin
public class EducationYearController {

	@Autowired
	private BusinessEducationYearService businessEducationYearService;

	@Autowired
	private BusinessStudentService businessStudentService;

	/**
	 * @param businessStudentService
	 */
	public EducationYearController(BusinessEducationYearService businessEducationYearService,
			BusinessStudentService businessStudentService) {
		this.businessEducationYearService = businessEducationYearService;
		this.businessStudentService = businessStudentService;
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EducationYear> addEducationYear(@PathVariable(value = "identity") String identity,
			@RequestBody EducationYear request) {

			businessStudentService.getOneStudent(identity).map(s -> {
											request.setStudent(s);
											return businessEducationYearService.createEducationYear(request);
		}).orElseThrow();

		return new ResponseEntity<>(request, HttpStatus.CREATED);

	}
}
