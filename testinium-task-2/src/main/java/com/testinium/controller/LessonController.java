/**
 * 
 */
package com.testinium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.service.business.BusinessLessonService;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@RestController
@RequestScope
@RequestMapping("/students/{idetity}/educationyears/{years}")
@CrossOrigin
public class LessonController {

	@Autowired
	private BusinessLessonService businessLessonService;
	
	
}
