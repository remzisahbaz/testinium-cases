package com.testinium.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lessonCode;
	private String lessonName;
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
		return lessonName;
	}

	/**
	 * @param lessonName the lessonName to set
	 */
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
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

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
		Lesson other = (Lesson) obj;
		return Objects.equals(id, other.id) && Objects.equals(lessonCode, other.lessonCode);
	}

	@Override
	public String toString() {
		return "Lesson [id=" + id + ", lessonCode=" + lessonCode + ", lessonName=" + lessonName + ", firstExamResult="
				+ firstExamResult + ", secondExamResult=" + secondExamResult + ", avarage=" + avarage
				+ ", educationYear=" + educationYear + "]";
	}

	
}
