/**
 * 
 */
package com.testinium.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "courses")
public class Course {

	@Id
	private String courseCode;
	private String courseName;
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<CourseRegistration> courseRegistration;
	/**
	 * 
	 */
	public Course() {
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the courseRegistration
	 */
	public Set<CourseRegistration> getCourseRegistration() {
		return courseRegistration;
	}
	/**
	 * @param courseRegistration the courseRegistration to set
	 */
	public void setCourseRegistration(Set<CourseRegistration> courseRegistration) {
		this.courseRegistration = courseRegistration;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseCode, courseName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(courseName, other.courseName);
	}
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", courseRegistration="
				+ courseRegistration + "]";
	}
	
	
}
