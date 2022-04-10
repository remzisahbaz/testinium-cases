package com.testinium.test.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.testinium.entity.EducationYear;
import com.testinium.entity.Student;

public class EducationYearTest {

	

	public Student createStudentSuccesssave()
	{
		var student= new Student();
			student.setFullName("Remzi ŞAHBAZ");
			student.setIdentity("1112");
			
			assertEquals("Remzi ŞAHBAZ", student.getFullName());
			assertEquals("1112", student.getIdentity());
			
			return student;
	}
	
	
	@DisplayName("EducationYearCorrectTest")
	@ParameterizedTest
	@CsvFileSource(resources = "educationyears.csv")
	public void  createEducationYearSuccessSave(Long id , String year)
	{
		var educationYear=new EducationYear();
		educationYear.setId(id);
		educationYear.setYear(year);
		educationYear.setStudent(createStudentSuccesssave());
		
		
	}
	
}
