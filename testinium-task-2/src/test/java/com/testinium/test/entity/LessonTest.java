package com.testinium.test.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.testinium.entity.EducationYear;
import com.testinium.entity.Lesson;
import com.testinium.entity.Student;

public class LessonTest {



	
	@DisplayName("LessonCreateCorrectTest")
	@ParameterizedTest
	@CsvFileSource(resources = "lessons.csv")
	public void createLessonSuccessSave(Long id, String lessonCode, String LessonName, double firstExamResult, double secondExamResult) {
		
		var student= new Student();
		student.setFullName("Remzi ŞAHBAZ");
		student.setIdentity("1112");
		
		assertEquals("Remzi ŞAHBAZ", student.getFullName());
		assertEquals("1112", student.getIdentity());
		
		
		
		var educationYear=new EducationYear();
		educationYear.setId(123L);
		educationYear.setYear("2015-2016");
		educationYear.setStudent(student);
		
		
		
		var lesson= new Lesson();
		lesson.setId(id);
		lesson.setLessonName(LessonName);
		lesson.setLessonCode(lessonCode);
		lesson.setFirstExamResult(firstExamResult);
		lesson.setSecondExamResult(secondExamResult);
		lesson.setAvarage((firstExamResult+secondExamResult)/2);
		lesson.setEducationYear(educationYear);
		
		assertEquals(lesson.getId(), id);
		assertEquals(lesson.getLessonName(), LessonName);
		assertEquals(lesson.getLessonCode(), lessonCode);
		assertEquals(lesson.getFirstExamResult(), firstExamResult);
		assertEquals(lesson.getSecondExamResult(), secondExamResult);
		assertEquals(lesson.getAvarage(), (firstExamResult+secondExamResult)/2);
		assertEquals(lesson.getEducationYear().getId(), 123L);
		assertEquals(lesson.getEducationYear().getStudent().getFullName(), "Remzi ŞAHBAZ");
		
	
	}
}
