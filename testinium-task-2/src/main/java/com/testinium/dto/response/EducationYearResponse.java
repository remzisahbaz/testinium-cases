/**
 * 
 */
package com.testinium.dto.response;

import java.util.Objects;

import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class EducationYearResponse {

	
	private Long EducationYearId;
	private String year;
	private Student student;
	/**
	 * 
	 */
	public EducationYearResponse() {
	}
	/**
	 * @return the educationYearId
	 */
	public Long getEducationYearId() {
		return EducationYearId;
	}
	/**
	 * @param educationYearId the educationYearId to set
	 */
	public void setEducationYearId(Long educationYearId) {
		EducationYearId = educationYearId;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public int hashCode() {
		return Objects.hash(EducationYearId, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationYearResponse other = (EducationYearResponse) obj;
		return Objects.equals(EducationYearId, other.EducationYearId) && Objects.equals(year, other.year);
	}
	@Override
	public String toString() {
		return "EducationYearResponse [EducationYearId=" + EducationYearId + ", year=" + year + ", student=" + student
				+ "]";
	}
	

}
