/**
 * 
 */
package com.testinium.dto.response;

import java.util.Objects;

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
public class LessonResponse {

	private Long id;
	private String lessonCode;
	private String LessonName;
	private double firstExamResult;
	private double secondExamResult;
	private double avarage;
	private EducationYear educationYear;
	/**
	 * 
	 */
	public LessonResponse() {
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the lessonCode
	 */
	public String getLessonCode() {
		return lessonCode;
	}
	/**
	 * @param lessonCode the lessonCode to set
	 */
	public void setLessonCode(String lessonCode) {
		this.lessonCode = lessonCode;
	}
	/**
	 * @return the lessonName
	 */
	public String getLessonName() {
		return LessonName;
	}
	/**
	 * @param lessonName the lessonName to set
	 */
	public void setLessonName(String lessonName) {
		LessonName = lessonName;
	}
	/**
	 * @return the firstExamResult
	 */
	public double getFirstExamResult() {
		return firstExamResult;
	}
	/**
	 * @param firstExamResult the firstExamResult to set
	 */
	public void setFirstExamResult(double firstExamResult) {
		this.firstExamResult = firstExamResult;
	}
	/**
	 * @return the secondExamResult
	 */
	public double getSecondExamResult() {
		return secondExamResult;
	}
	/**
	 * @param secondExamResult the secondExamResult to set
	 */
	public void setSecondExamResult(double secondExamResult) {
		this.secondExamResult = secondExamResult;
	}
	/**
	 * @return the avarage
	 */
	public double getAvarage() {
		return avarage;
	}
	/**
	 * @param avarage the avarage to set
	 */
	public void setAvarage(double avarage) {
		this.avarage = avarage;
	}
	/**
	 * @return the educationYear
	 */
	public EducationYear getEducationYear() {
		return educationYear;
	}
	/**
	 * @param educationYear the educationYear to set
	 */
	public void setEducationYear(EducationYear educationYear) {
		this.educationYear = educationYear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, lessonCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LessonResponse other = (LessonResponse) obj;
		return Objects.equals(id, other.id) && Objects.equals(lessonCode, other.lessonCode);
	}
	@Override
	public String toString() {
		return "LessonResponse [lessonCode=" + lessonCode + ", LessonName=" + LessonName + ", firstExamResult="
				+ firstExamResult + ", secondExamResult=" + secondExamResult + ", avarage=" + avarage
				+ ", educationYear=" + educationYear + "]";
	}
	
	
}
