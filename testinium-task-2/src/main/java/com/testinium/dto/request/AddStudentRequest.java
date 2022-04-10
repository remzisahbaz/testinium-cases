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
	@Override
	public int hashCode() {
		return Objects.hash(fullName, identity);
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
		return Objects.equals(fullName, other.fullName) && Objects.equals(identity, other.identity);
	}
	@Override
	public String toString() {
		return "AddStudentRequest [identity=" + identity + ", fullName=" + fullName + "]";
	}
	
	
}
