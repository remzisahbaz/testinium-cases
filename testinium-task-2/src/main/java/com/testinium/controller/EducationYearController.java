package com.testinium.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.dto.response.AddEducationYearResponse;
import com.testinium.entity.EducationYear;
import com.testinium.service.business.BusinessEducationYearService;

@RestController
@RequestScope
@RequestMapping("/students/{identity}/educationyears")
@CrossOrigin
public class EducationYearController {

	@Autowired
	private BusinessEducationYearService businessEducationYearService;

	/**
	 * @param businessStudentService
	 */
	public EducationYearController(BusinessEducationYearService businessEducationYearService) {
		this.businessEducationYearService = businessEducationYearService;
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public AddEducationYearResponse addEducationYear(@PathVariable(value = "identity") String identity,
			@RequestBody EducationYear request) {

		Objects.nonNull(request);
		Objects.nonNull(identity);

		return businessEducationYearService.createEducationYear(request, identity);

	}
}
