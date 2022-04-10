/**
 * 
 */
package com.testinium.dto.response;

import java.util.Set;

import com.testinium.entity.CourseRegistration;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Data
@Builder
public class courseResponse {

	private String courseCode;
	private String courseName;
	private Set<CourseRegistration> courseRegistration;
	
	
}
