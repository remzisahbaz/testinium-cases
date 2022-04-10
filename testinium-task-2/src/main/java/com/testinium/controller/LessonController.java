/**
 * 
 */
package com.testinium.controller;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.dto.request.AddLessonRequest;
import com.testinium.entity.Lesson;
import com.testinium.service.business.BusinessLessonService;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@RestController
@RequestScope
@RequestMapping("/students/{identity}/educationyears/{year}/lessons")
@CrossOrigin
public class LessonController {

	@Autowired
	private BusinessLessonService businessLessonService;

	/**
	 * @param businessLessonService

	 */
	public LessonController(BusinessLessonService businessLessonService
			 ) {
		this.businessLessonService = businessLessonService;
	
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Lesson> addLesson(@RequestBody AddLessonRequest request,
			@PathVariable(value = "year") String year, @PathVariable(value = "identity") String identity) {

		Objects.nonNull(identity);
		Objects.nonNull(year);
		Objects.nonNull(request);
			

		return businessLessonService.createLesson(identity,year,request);
	}
}
