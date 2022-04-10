/**
 * 
 */
package com.testinium.service;

import java.util.Optional;

import com.testinium.dto.request.CourseRegistrationRequest;
import com.testinium.entity.CourseRegistration;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface CourseRegistrationService {

	Optional<CourseRegistration> createCourseRegistration(CourseRegistrationRequest courseRegistration);

}
