/**
 * 
 */
package com.testinium.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "courseRegistration")
@Data
@Builder

public class CourseRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String yearCode;
	private boolean state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resulstofexam_id")
	private ResulstOfExam resulstOfExam;
	
}
