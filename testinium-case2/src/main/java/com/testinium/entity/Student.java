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
@Table(name = "students")
@Data
@Builder
public class Student {

	@Id
	private String schoolNo;
	private String fullName;
	@OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
	private Set<CourseRegistration> courseRegistration;
	
	
}
