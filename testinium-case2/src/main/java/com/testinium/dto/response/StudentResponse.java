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
public class StudentResponse {

	private String schoolNo;
	private String fullName;

}
