/**
 * 
 */
package com.testinium.service.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.testinium.repository.LessonRepository;
import com.testinium.service.LessonService;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class BusinessLessonService implements LessonService{

	@Autowired
	private LessonRepository lessonRepository;
}
