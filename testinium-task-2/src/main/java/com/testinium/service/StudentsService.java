/**
 * 
 */
package com.testinium.service;

import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface StudentsService {

	AddStudentResponse createStudent(AddStudentRequest request);

	
}
