/**
 * 
 */
package com.testinium.configuration;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.request.GetInformantionStudent;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.ExamGradeAndAvarageAllStudentsResponse;
import com.testinium.entity.EducationYear;
import com.testinium.entity.Lesson;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Configuration
public class ModelMapperConfiguration {

	private static final Converter<AddStudentRequest, Student> Request_Convert_To_Student = (context) -> {
		var request = context.getSource();
		var student = context.getDestination();

		student.setIdentity(request.getIdentity());
		student.setFullName(request.getFullName());

		var educationYear = request.getEducationYear().stream().map(eduyear -> {

			var newEdu = new EducationYear();
			newEdu.setYear(eduyear.getYear());

			var lesson = eduyear.getLesson().stream().map(les -> {

				var newLesson = new Lesson();
				newLesson.setCode(les.getCode());
				newLesson.setName(les.getName());
				newLesson.setAvarage(les.getAvarage());
				newLesson.setCode(les.getCode());
				newLesson.setFirstExamResult(les.getFirstExamResult());
				newLesson.setSeconExamResult(les.getSeconExamResult());
				return newLesson;
			}).toList();

			newEdu.setLesson(lesson);
			return newEdu;
		}).toList();
		student.setEducationYear(educationYear);

		return student;
	};
	private static final Converter<Student, AddStudentResponse> Student_Convert_To_Response = (context) -> {
		var student = context.getSource();
		var response = context.getDestination();

		response.setIdentity(student.getIdentity());
		response.setFullName(student.getFullName());

		var educationYear = student.getEducationYear().stream().map(eduyear -> {

			var newEdu = new EducationYear();
			newEdu.setYear(eduyear.getYear());

			var lesson = eduyear.getLesson().stream().map(les -> {

				var newLesson = new Lesson();
				newLesson.setCode(les.getCode());
				newLesson.setName(les.getName());
				newLesson.setAvarage(les.getAvarage());
				newLesson.setCode(les.getCode());
				newLesson.setFirstExamResult(les.getFirstExamResult());
				newLesson.setSeconExamResult(les.getSeconExamResult());
				return newLesson;
			}).toList();

			newEdu.setLesson(lesson);
			return newEdu;
		}).toList();
		response.setEducationYear(educationYear);

		return response;
	};
	private static final Converter<GetInformantionStudent, ExamGradeAndAvarageAllStudentsResponse> InformantionOfStudent_Convert_To_LessonsOfStudent = (context) -> {
		var student = context.getSource();
		var response = context.getDestination();
		List<Lesson> lessonList= new ArrayList<Lesson>();
		
		response.setIdentity(student.getIdentity());
		response.setFullName(student.getFullName());
		
		var educationYear = student.getEducationYear().stream().map(eduyear -> {
			
			var newEdu = new EducationYear();
			newEdu.setYear(eduyear.getYear());
			
			var lesson = eduyear.getLesson().stream().map(les -> {
				
										var newLesson = new Lesson();
										newLesson.setCode(les.getCode());
										newLesson.setName(les.getName());
										newLesson.setAvarage(les.getAvarage());
										newLesson.setCode(les.getCode());
										newLesson.setFirstExamResult(les.getFirstExamResult());
										newLesson.setSeconExamResult(les.getSeconExamResult());
										return newLesson;
										}).toList();
			
			//newEdu.setLesson(lesson);
			lessonList.addAll(lesson);
			return newEdu;
		}).toList();
		response.setLesson(lessonList);
		return response;
	};

	@Bean("modelmapperstudent")
	public ModelMapper mapper() {

		var mapper = new ModelMapper();
		mapper.addConverter(Request_Convert_To_Student, AddStudentRequest.class, Student.class);
		mapper.addConverter(Student_Convert_To_Response, Student.class, AddStudentResponse.class);
		mapper.addConverter(InformantionOfStudent_Convert_To_LessonsOfStudent, GetInformantionStudent.class, ExamGradeAndAvarageAllStudentsResponse.class);

		return mapper;

	}

}
