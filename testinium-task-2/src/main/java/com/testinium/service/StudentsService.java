/**
 * 
 */
package com.testinium.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.ExamGradeAndAvarageAllStudentsResponse;
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

	ResponseEntity<Student> createStudent3(Student request);

	Optional<Student> getOneStudent(String identity);

	
}
