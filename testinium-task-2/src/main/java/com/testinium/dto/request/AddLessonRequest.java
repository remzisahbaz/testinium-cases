package com.testinium.dto.request;

import java.util.Objects;

import com.testinium.entity.EducationYear;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
public class AddLessonRequest {

	private String lessonCode;
	private String name;
	private double firstExamResult;
	private double secondExamResult;
	private double avarage;
	private EducationYear educationYear;
	/**
	 * 
	 */
	public AddLessonRequest() {
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
		return Objects.hash(educationYear, lessonCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddLessonRequest other = (AddLessonRequest) obj;
		return Objects.equals(educationYear, other.educationYear) && Objects.equals(lessonCode, other.lessonCode);
	}
	@Override
	public String toString() {
		return "AddLessonRequest [lessonCode=" + lessonCode + ", name=" + name + ", firstExamResult=" + firstExamResult
				+ ", secondExamResult=" + secondExamResult + ", avarage=" + avarage + ", educationYear=" + educationYear
				+ "]";
	}


}
