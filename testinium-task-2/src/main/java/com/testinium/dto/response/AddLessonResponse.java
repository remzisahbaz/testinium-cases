/**
 * 
 */
package com.testinium.dto.response;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testinium.entity.EducationYear;

/**
 * @author Remzi ŞAHABZ
 *
 */
public class AddLessonResponse {

	private Long id;
	private String lessonCode;
	private String LessonName;
	private double firstExamResult;
	private double secondExamResult;
	private double avarage;
	private EducationYear educationYear;
}
