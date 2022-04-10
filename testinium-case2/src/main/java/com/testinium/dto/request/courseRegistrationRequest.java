/**
 * 
 */
package com.testinium.dto.request;

import com.testinium.entity.ResulstOfExam;
import com.testinium.entity.Student;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Data
@Builder

public class courseRegistrationRequest {

	private String yearCode;
	private boolean state;
	private Student student;
	private ResulstOfExam resulstOfExam;

}
