/**
 * 
 */
package com.testinium.service;

import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.ExamGradeAndAvarageAllStudentsResponse;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface StudentsService {

	AddStudentResponse createStudent(AddStudentRequest request);

	String createStudent2(AddStudentRequest request);

	ExamGradeAndAvarageAllStudentsResponse getAllStudentsByYearAndLessonCode(String year, String lessonCode);

	
}
