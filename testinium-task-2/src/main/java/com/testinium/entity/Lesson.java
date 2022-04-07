package com.testinium.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "lessons")
public class Lesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String code;
	private String name;
	private double firstExamResult;
	private double seconExamResult;
	private double avarage;
	
	
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
	 * @return the seconExamResult
	 */
	public double getSeconExamResult() {
		return seconExamResult;
	}
	/**
	 * @param seconExamResult the seconExamResult to set
	 */
	public void setSeconExamResult(double seconExamResult) {
		this.seconExamResult = seconExamResult;
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
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public String toString() {
		return "Lesson [code=" + code + ", name=" + name + ", firstExamResult=" + firstExamResult + ", seconExamResult="
				+ seconExamResult + ", avarage=" + avarage + "]";
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
		return Objects.equals(code, other.code);
	}
	
	
}
