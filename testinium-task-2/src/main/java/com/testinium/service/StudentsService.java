/**
 * 
 */
package com.testinium.service;

import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.StudentResponse;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface StudentsService {

//	AddStudentResponse createStudent(AddStudentRequest request);
//
//
//	ExamGradeAndAvarageAllStudentsResponse getAllStudentsByYearAndLessonCode(String year, String lessonCode);

	AddStudentResponse createStudent3(Student request);

	StudentResponse getOneStudentByIdentity(String identity);

	
}
