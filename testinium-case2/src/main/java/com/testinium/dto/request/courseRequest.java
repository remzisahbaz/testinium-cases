/**
 * 
 */
package com.testinium.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Data
@Builder
public class courseRequest {

	private String courseCode;
	private String courseName;

}
