/**
 * 
 */
package com.testinium.service;

import org.springframework.http.ResponseEntity;

import com.testinium.dto.request.AddLessonRequest;
import com.testinium.entity.Lesson;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface LessonService {

	ResponseEntity<Lesson> createLesson(String identity, String year, AddLessonRequest request);

}
