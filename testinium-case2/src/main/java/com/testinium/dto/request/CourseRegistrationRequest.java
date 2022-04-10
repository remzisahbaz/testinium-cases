/**
 * 
 */
package com.testinium.dto.request;

import java.util.Objects;

import com.testinium.entity.Course;
import com.testinium.entity.ResultsOfExam;
import com.testinium.entity.Student;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */

public class CourseRegistrationRequest {


	private String yearCode;
	private boolean state;
	private String schoolNo;
	private Long resultsofexam_id;
	private String courseCode;
	/**
	 * 
	 */
	public CourseRegistrationRequest() {
	}
	/**
	 * @return the yearCode
	 */
	public String getYearCode() {
		return yearCode;
	}
	/**
	 * @param yearCode the yearCode to set
	 */
	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}
	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	/**
	 * @return the schoolNo
	 */
	public String getSchoolNo() {
		return schoolNo;
	}
	/**
	 * @param schoolNo the schoolNo to set
	 */
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	/**
	 * @return the resultsofexam_id
	 */
	public Long getResultsofexam_id() {
		return resultsofexam_id;
	}
	/**
	 * @param resultsofexam_id the resultsofexam_id to set
	 */
	public void setResultsofexam_id(Long resultsofexam_id) {
		this.resultsofexam_id = resultsofexam_id;
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
	@Override
	public int hashCode() {
		return Objects.hash(courseCode, resultsofexam_id, yearCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseRegistrationRequest other = (CourseRegistrationRequest) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(resultsofexam_id, other.resultsofexam_id)
				&& Objects.equals(yearCode, other.yearCode);
	}
	@Override
	public String toString() {
		return "CourseRegistrationRequest [yearCode=" + yearCode + ", state=" + state + ", schoolNo=" + schoolNo
				+ ", resultsofexam_id=" + resultsofexam_id + ", courseCode=" + courseCode + "]";
	}
	
	
}
