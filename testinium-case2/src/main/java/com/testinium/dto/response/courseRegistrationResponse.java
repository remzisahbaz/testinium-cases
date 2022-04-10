/**
 * 
 */
package com.testinium.dto.response;

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

public class courseRegistrationResponse {

	private String yearCode;
	private boolean state;
	private Student student;
	private ResulstOfExam resulstOfExam;

}
