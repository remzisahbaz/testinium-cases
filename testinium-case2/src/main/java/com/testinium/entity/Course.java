/**
 * 
 */
package com.testinium.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "courses")
@Data
@Builder
public class Course {

	@Id
	private String courseCode;
	private String courseName;
	@OneToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private Set<ResulstOfExam> courseRegistration; 
	
	
}
