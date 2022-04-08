/**
 * 
 */
package com.testinium.dto.response;

import java.util.List;
import java.util.Objects;

import com.testinium.entity.Lesson;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class ExamGradeAndAvarageAllStudentsResponse {

	private String identity;
	private String fullName;
	private List<Lesson> lesson;
	
	
	/**
	 * 
	 */
	public ExamGradeAndAvarageAllStudentsResponse() {
	}
	/**
	 * @return the identity
	 */
	public String getIdentity() {
		return identity;
	}
	/**
	 * @param identity the identity to set
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the lesson
	 */
	public List<Lesson> getLesson() {
		return lesson;
	}
	/**
	 * @param lesson the lesson to set
	 */
	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}
	@Override
	public int hashCode() {
		return Objects.hash(identity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamGradeAndAvarageAllStudentsResponse other = (ExamGradeAndAvarageAllStudentsResponse) obj;
		return Objects.equals(identity, other.identity);
	}
	@Override
	public String toString() {
		return "ExamGradeAndAvarageAllStudentsResponse [identity=" + identity + ", fullName=" + fullName + ", lesson="
				+ lesson + "]";
	}

	
}
