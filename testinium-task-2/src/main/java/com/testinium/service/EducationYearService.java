/**
 * 
 */
package com.testinium.service;

import com.testinium.dto.response.AddEducationYearResponse;
import com.testinium.dto.response.EducationYearResponse;
import com.testinium.entity.EducationYear;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface EducationYearService {

	AddEducationYearResponse createEducationYear(EducationYear request,String identity);

	EducationYearResponse getOneEducationYearByYear(String year);

	EducationYearResponse getOneEducationYearByStudentIdentity(String identity);

}
