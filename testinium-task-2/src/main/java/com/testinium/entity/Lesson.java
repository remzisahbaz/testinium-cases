package com.testinium.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "lessons")
public class Lesson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String code;
	private String name;
	private double firstExamResult;
	private double secondExamResult;
	private double avarage;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "educationyear_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private EducationYear educationYear;

	/**
	 * 
	 */
	public Lesson() {
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
		return Objects.hash(code, educationYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lesson other = (Lesson) obj;
		return Objects.equals(code, other.code) && Objects.equals(educationYear, other.educationYear);
	}

	@Override
	public String toString() {
		return "Lesson [code=" + code + ", name=" + name + ", firstExamResult=" + firstExamResult
				+ ", secondExamResult=" + secondExamResult + ", avarage=" + avarage + ", educationYear=" + educationYear
				+ "]";
	}


}
