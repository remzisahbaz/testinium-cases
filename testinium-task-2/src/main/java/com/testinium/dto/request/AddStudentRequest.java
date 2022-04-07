package com.testinium.dto.request;

import java.util.List;
import java.util.Objects;

import com.testinium.entity.EducationYear;
/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
public class AddStudentRequest {

	private String identity;
	private String fullName;
	private List<EducationYear> educationYear;
	
	
	/**
	 * 
	 */
	public AddStudentRequest() {
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
	 * @return the educationYear
	 */
	public List<EducationYear> getEducationYear() {
		return educationYear;
	}
	/**
	 * @param educationYear the educationYear to set
	 */
	public void setEducationYear(List<EducationYear> educationYear) {
		this.educationYear = educationYear;
	}
	@Override
	public String toString() {
		return "AddStudentRequest [identity=" + identity + ", fullName=" + fullName + ", educationYear=" + educationYear
				+ "]";
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
		AddStudentRequest other = (AddStudentRequest) obj;
		return Objects.equals(identity, other.identity);
	}
	
	
}
