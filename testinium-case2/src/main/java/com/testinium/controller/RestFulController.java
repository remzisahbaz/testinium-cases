/**
 * 
 */
package com.testinium.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.testinium.dto.request.CourseRegistrationRequest;
import com.testinium.entity.Course;
import com.testinium.entity.CourseRegistration;
import com.testinium.entity.ResultsOfExam;
import com.testinium.entity.Student;
import com.testinium.service.business.StandartServiceBusiness;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@RestController
@RequestScope
@RequestMapping("/")
@CrossOrigin
@Api(value = "Student-Course Api documentation")
public class RestFulController {

	@Autowired
	private StandartServiceBusiness standartServiceBusiness;

	/**
	 * @param standartServiceBusiness
	 */
	public RestFulController(StandartServiceBusiness standartServiceBusiness) {
		this.standartServiceBusiness = standartServiceBusiness;
	}

	private final List<Student> studentList = new ArrayList<>();

	// classin const calistiktan sonra bu metod calissin.
	@PostConstruct
	public void init() {
		var student=new Student();
			student.setFullName("Remzi ŞAHBAZ");
			student.setSchoolNo("A0009");
		studentList.add(student);
	}

	 @ApiOperation(value = "New Student adding method")
	@PostMapping(value = "students", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Student> createStudent(@RequestBody Student student) throws Exception {
		System.out.println(student);
		// Objects.nonNull(student);
		return standartServiceBusiness.createStudent(student);
	}

	 @ApiOperation(value = "New Course adding method")
	@PostMapping(value = "courses", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Course> createCourse(@RequestBody Course course) throws Exception {
		System.out.println(course);
		// Objects.nonNull(student);
		return standartServiceBusiness.createCourse(course);
	}

	 @ApiOperation(value = "New Course Registration adding method")
	@PostMapping(value = "courseregistration", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<CourseRegistration> createCourseRegistration(
			@RequestBody CourseRegistrationRequest courseRegistration) throws Exception {
		System.out.println(courseRegistration);
		// Objects.nonNull(student);
		return standartServiceBusiness.createCourseRegistration(courseRegistration);
	}

	 @ApiOperation(value = "New Results Of Exam adding method")
	@PostMapping(value = "resultsofexam", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<ResultsOfExam> createResultsOfExam(@RequestBody ResultsOfExam resultsOfExam) throws Exception {
		System.out.println(resultsOfExam);
		// Objects.nonNull(student);
		return standartServiceBusiness.createResultsOfExam(resultsOfExam);
	}

}
