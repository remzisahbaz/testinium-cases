package com.testinium.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name="students")
public class Student {

	@Id
	private String identity;
	private String fullName;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<EducationYear> educationYear;
	/**
	 * 
	 */
	public Student() {
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
		Student other = (Student) obj;
		return Objects.equals(identity, other.identity);
	}
	@Override
	public String toString() {
		return "Student [identity=" + identity + ", fullName=" + fullName + ", educationYear=" + educationYear + "]";
	}
	
	
}
