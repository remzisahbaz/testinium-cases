package com.testinium.service.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testinium.dto.request.CourseRegistrationRequest;
import com.testinium.entity.Course;
import com.testinium.entity.CourseRegistration;
import com.testinium.entity.ResultsOfExam;
import com.testinium.entity.Student;
import com.testinium.repository.CourseRegistrationRepository;
import com.testinium.repository.CourseRepository;
import com.testinium.repository.ResultsOfExamRepository;
import com.testinium.repository.StudentRepository;
import com.testinium.service.CourseRegistrationService;
import com.testinium.service.CourseService;
import com.testinium.service.ResultsOfExamService;
import com.testinium.service.StudentService;

@Service
public class StandartServiceBusiness
		implements StudentService, ResultsOfExamService, CourseService, CourseRegistrationService {

	@Autowired
	private StudentRepository studentr;

	@Autowired
	private CourseRegistrationRepository courseregr;

	@Autowired
	private CourseRepository courser;

	@Autowired
	private ResultsOfExamRepository resultExRep;

	/**
	 * @param studentr
	 * @param courseregr
	 * @param courser
	 * @param resultp
	 */
	public StandartServiceBusiness(StudentRepository studentr, CourseRegistrationRepository courseregr,
			CourseRepository courser, ResultsOfExamRepository resultExRep) {
		this.studentr = studentr;
		this.courseregr = courseregr;
		this.courser = courser;
		this.resultExRep = resultExRep;
	}

	@Override
	public Optional<Student> createStudent(Student student) {

		var exist = studentr.existsById(student.getSchoolNo());
		if (!exist) {

			return Optional.of(studentr.save(student));
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<CourseRegistration> createCourseRegistration(CourseRegistrationRequest courseRegistration) {

		var newcoursereg = new CourseRegistration();
		var student = studentr.findById(courseRegistration.getSchoolNo());

		if (!student.isEmpty()) {
			newcoursereg.setStudent(student.get());
			var course = courser.findById(courseRegistration.getCourseCode());

			if (!course.isEmpty()) {
				newcoursereg.setCourse(course.get());
				var resultsOfExam = resultExRep.findById(courseRegistration.getResultsofexam_id());

				newcoursereg.setResulstOfExam(resultsOfExam.get());
				newcoursereg.setYearCode(courseRegistration.getYearCode());
				newcoursereg.setState(courseRegistration.isState());
				
				System.out.println(newcoursereg);
				return Optional.of(courseregr.save(newcoursereg));

			}
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<Course> createCourse(Course course) {
		var exist = courser.existsById(course.getCourseCode());
		if (!exist) {

			return Optional.of(courser.save(course));
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<ResultsOfExam> createResultsOfExam(ResultsOfExam courseRegistration) {
		var exist = resultExRep.existsById(courseRegistration.getId());
		if (!exist) {

			return Optional.of(resultExRep.save(courseRegistration));
		}

		return Optional.ofNullable(null);
	}

	
	@Override
	public Optional<String> getStudentBySchoolYearAndCourseCodeAndSchoolNo(String schoolNo, String courseCode,
			String year) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<String> getAllStudentAvarageAndResultsOfExam(String courseCode, String year) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<String> createAnyCourseAnyStudent(String courseCode, String schoolNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
