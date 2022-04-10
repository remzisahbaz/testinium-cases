package com.testinium.test.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.testinium.entity.Student;

public class StudentTest {

	
	@DisplayName("StudentCorrectTest")
	@ParameterizedTest
	@CsvFileSource(resources = "students.csv")
	public void createStudentSuccesssave(String identity, String fullName)
	{
		var student= new Student();
			student.setFullName(fullName);
			student.setIdentity(identity);
			
			assertEquals(identity, student.getIdentity());
			assertEquals(fullName, student.getFullName());
	}
}
