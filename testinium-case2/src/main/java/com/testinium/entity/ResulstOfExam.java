/**
 * 
 */
package com.testinium.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "resulstofexam")

public class ResulstOfExam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(
			fetch = FetchType.LAZY)
	@JsonIgnore
	private CourseRegistration courseRegistration;
	
	private String firstExamResult;
	private String secondExamResult;
	private double avarage;
	private boolean stateOfResult;
	/**
	 * 
	 */
	public ResulstOfExam() {
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
	 * @return the courseRegistration
	 */
	public CourseRegistration getCourseRegistration() {
		return courseRegistration;
	}
	/**
	 * @param courseRegistration the courseRegistration to set
	 */
	public void setCourseRegistration(CourseRegistration courseRegistration) {
		this.courseRegistration = courseRegistration;
	}
	/**
	 * @return the firstExamResult
	 */
	public String getFirstExamResult() {
		return firstExamResult;
	}
	/**
	 * @param firstExamResult the firstExamResult to set
	 */
	public void setFirstExamResult(String firstExamResult) {
		this.firstExamResult = firstExamResult;
	}
	/**
	 * @return the secondExamResult
	 */
	public String getSecondExamResult() {
		return secondExamResult;
	}
	/**
	 * @param secondExamResult the secondExamResult to set
	 */
	public void setSecondExamResult(String secondExamResult) {
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
	 * @return the stateOfResult
	 */
	public boolean isStateOfResult() {
		return stateOfResult;
	}
	/**
	 * @param stateOfResult the stateOfResult to set
	 */
	public void setStateOfResult(boolean stateOfResult) {
		this.stateOfResult = stateOfResult;
	}
	@Override
	public int hashCode() {
		return Objects.hash(avarage, id, stateOfResult);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResulstOfExam other = (ResulstOfExam) obj;
		return Double.doubleToLongBits(avarage) == Double.doubleToLongBits(other.avarage)
				&& Objects.equals(id, other.id) && stateOfResult == other.stateOfResult;
	}
	@Override
	public String toString() {
		return "ResulstOfExam [id=" + id + ", courseRegistration=" + courseRegistration + ", firstExamResult="
				+ firstExamResult + ", secondExamResult=" + secondExamResult + ", avarage=" + avarage
				+ ", stateOfResult=" + stateOfResult + "]";
	}
	
	
}
