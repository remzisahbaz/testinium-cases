/**
 * 
 */
package com.testinium.configuration;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.testinium.dto.request.AddLessonRequest;
import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddEducationYearResponse;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.EducationYearResponse;
import com.testinium.dto.response.StudentResponse;
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
		return student;
	};

	private static final Converter<AddLessonRequest, Lesson> AddLessonRequest_Convert_To_Lesson = (context) -> {
		var request = context.getSource();
		var lesson = context.getDestination();

		lesson.setAvarage(request.getAvarage());
		lesson.setLessonCode(lesson.getLessonCode());
		lesson.setFirstExamResult(request.getFirstExamResult());
		lesson.setLessonName(request.getName());
		lesson.setSecondExamResult(request.getSecondExamResult());
		lesson.setEducationYear(request.getEducationYear());

		return lesson;
	};

	private static final Converter<EducationYearResponse, EducationYear> EducationYearResponse_Convert_To_EducationYear = (
			context) -> {
		var response = context.getSource();
		var educationYear = context.getDestination();

		educationYear.setId(response.getEducationYearId());
		educationYear.setStudent(response.getStudent());
		educationYear.setYear(response.getYear());

		return educationYear;
	};
	private static final Converter<EducationYear, EducationYearResponse> EducationYear_Convert_To_EducationYearResponse = (
			context) -> {
		var educationYear = context.getSource();
		var response = context.getDestination();

		response.setEducationYearId(educationYear.getId());
		response.setStudent(educationYear.getStudent());
		response.setYear(educationYear.getYear());

		return response;
	};
	private static final Converter<EducationYear, AddEducationYearResponse> EducationYear_Convert_To_AddEducationYearResponse = (
			context) -> {
				var educationYear = context.getSource();
				var response = context.getDestination();
				
				response.setEducationYearId(educationYear.getId());
				response.setStudent(educationYear.getStudent());
				response.setYear(educationYear.getYear());
				
				return response;
			};
	private static final Converter<AddStudentResponse, Student> AddStudentResponse_Convert_To_Student = (context) -> {
		var response = context.getSource();
		var student = context.getDestination();

		student.setIdentity(response.getIdentity());
		;
		student.setFullName(response.getFullName());

		return student;
	};
	private static final Converter<Student, AddStudentResponse> Student_Convert_To_AddStudentResponse = (context) -> {
		var student = context.getSource();
		var response = context.getDestination();

		response.setIdentity(student.getIdentity());
		;
		response.setFullName(student.getFullName());

		return response;
	};
	private static final Converter<Student, AddStudentRequest> Student_Convert_To_AddStudentRequest = (context) -> {
		var student = context.getSource();
		var request = context.getDestination();

		request.setIdentity(student.getIdentity());
		
		request.setFullName(student.getFullName());

		return request;
	};
	private static final Converter<StudentResponse, Student> StudentResponse_Convert_To_Student = (context) -> {
		var response = context.getSource();
		var student = context.getDestination();
		
		student.setIdentity(response.getIdentity());
		
		student.setFullName(response.getFullName());
		
		return student;
	};
	private static final Converter<Student, StudentResponse> Student_Convert_To_StudentResponse = (context) -> {
		var student = context.getSource();
		var response = context.getDestination();
		
		response.setIdentity(student.getIdentity());
		
		response.setFullName(student.getFullName());
		
		return response;
	};

	@Bean("modelmapperstudent")
	public ModelMapper mapper() {

		var mapper = new ModelMapper();
//		mapper.addConverter(InformantionOfStudent_Convert_To_LessonsOfStudent, GetInformantionStudent.class, ExamGradeAndAvarageAllStudentsResponse.class);
		mapper.addConverter(AddLessonRequest_Convert_To_Lesson, AddLessonRequest.class, Lesson.class);
		mapper.addConverter(EducationYearResponse_Convert_To_EducationYear, EducationYearResponse.class,
				EducationYear.class);
		mapper.addConverter(EducationYear_Convert_To_EducationYearResponse, EducationYear.class,
				EducationYearResponse.class);
		mapper.addConverter(EducationYear_Convert_To_AddEducationYearResponse, EducationYear.class,
				AddEducationYearResponse.class);
		mapper.addConverter(AddStudentResponse_Convert_To_Student, AddStudentResponse.class, Student.class);
		mapper.addConverter(Student_Convert_To_AddStudentResponse, Student.class, AddStudentResponse.class);
		mapper.addConverter(Student_Convert_To_AddStudentRequest, Student.class, AddStudentRequest.class);
		mapper.addConverter(Request_Convert_To_Student, AddStudentRequest.class, Student.class);
		mapper.addConverter(StudentResponse_Convert_To_Student, StudentResponse.class, Student.class);
		mapper.addConverter(Student_Convert_To_StudentResponse, Student.class, StudentResponse.class);

		return mapper;

	}

}
