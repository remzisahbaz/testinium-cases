/**
 * 
 */
package com.testinium.service;

import org.springframework.http.ResponseEntity;

import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.ExamGradeAndAvarageAllStudentsResponse;
import com.testinium.entity.EducationYear;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface EducationYearService {

	ResponseEntity<EducationYear> createEducationYear(EducationYear request);

}
