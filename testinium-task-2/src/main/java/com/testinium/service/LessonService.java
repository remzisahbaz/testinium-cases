/**
 * 
 */
package com.testinium.service;

import com.testinium.dto.request.AddLessonRequest;
import com.testinium.dto.response.AddLessonResponse;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface LessonService {

	AddLessonResponse createLesson(String identity, String year, AddLessonRequest request);

}
