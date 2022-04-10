/**
 * 
 */
package com.testinium.dto.response;

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
	
	
}
