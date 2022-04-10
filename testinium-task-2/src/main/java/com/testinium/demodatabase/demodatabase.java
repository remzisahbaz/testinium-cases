/**
 * 
 */
package com.testinium.demodatabase;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.testinium.dto.response.StudentResponse;
import com.testinium.entity.EducationYear;
import com.testinium.entity.Lesson;
import com.testinium.entity.Student;
import com.testinium.repository.EducationYearRepository;
import com.testinium.repository.LessonRepository;
import com.testinium.repository.StudentRepository;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class demodatabase {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EducationYearRepository educationYearRepository;
	@Autowired
	private LessonRepository lessonRepository;
	
	
	
	/**
	 * @param studentRepository
	 * @param educationYearRepository
	 * @param lessonRepository
	 */
	public demodatabase(StudentRepository studentRepository, EducationYearRepository educationYearRepository,
			LessonRepository lessonRepository) {
		this.studentRepository = studentRepository;
		this.educationYearRepository = educationYearRepository;
		this.lessonRepository = lessonRepository;
	}
	
	public Map<Integer, Student> students() {

		Map<Integer, Student> list = new HashMap<>();

		var s = new Student();
		s.setFullName("Remzi ŞAHBAZ");
		s.setIdentity("A2223331");
		studentRepository.save(s);
		
		list.put(1, s);
		s.setFullName("Murat KARANFİL");
		s.setIdentity("A2223333");
		studentRepository.save(s);

		list.put(2, s);
		s.setFullName("Ömer KARABAŞ");
		s.setIdentity("A2223339");
		studentRepository.save(s);

		list.put(3, s);
		
		return list;
	}
	
	public Map<Integer, EducationYear> educationYears() {

		Map<Integer, EducationYear> educationYear = new HashMap<>();

		//1. student
		//1.education year
		var eduy = new EducationYear();
		eduy.setId(1L);
		eduy.setYear("2019-2020");
		eduy.setStudent(students().get(1));
		educationYearRepository.save(eduy);
		educationYear.put(1, eduy);
		//2.education year
		eduy.setId(2L);
		eduy.setYear("2020-2021");
		eduy.setStudent(students().get(2));
		educationYearRepository.save(eduy);
		educationYear.put(1, eduy);

		
		//2. student
		//1.education year
		eduy.setId(1L);
		eduy.setYear("2019-2020");
		eduy.setStudent(students().get(1));
		educationYearRepository.save(eduy);
		educationYear.put(1, eduy);
		//2.education year
		eduy.setId(2L);
		eduy.setYear("2020-2021");
		eduy.setStudent(students().get(2));
		educationYearRepository.save(eduy);
		educationYear.put(1, eduy);

		
		
		
		return educationYear;
	}
	
	
	public Map<Integer, Lesson> lessons() {

		Map<Integer, Lesson> list = new HashMap<>();

		var lesson = new Lesson();
		lesson.setId(1L);
		lesson.setLessonName("Mathematics");
		lesson.setLessonCode("MAT0008");
		lesson.setFirstExamResult(85.9);
		lesson.setSecondExamResult(96.7);
		lesson.setAvarage((85.9+96.7)/2);
	//	lesson.setEducationYear();

		list.put(2, lesson);
		lesson.setId(2L);
		lesson.setLessonName("Physics");
		lesson.setLessonCode("PHY0074");
		lesson.setFirstExamResult(85.9);
		lesson.setSecondExamResult(96.7);
		lesson.setAvarage((85.9+96.7)/2);
		//	lesson.setEducationYear();
		
		list.put(3, lesson);
		lesson.setId(3L);
		lesson.setLessonName("Chemistry");
		lesson.setLessonCode("CHE0009");
		lesson.setFirstExamResult(85.9);
		lesson.setSecondExamResult(96.7);
		lesson.setAvarage((85.9+96.7)/2);
		//	lesson.setEducationYear();
		
		list.put(1, lesson);
	
		return list;
	}
	
}
