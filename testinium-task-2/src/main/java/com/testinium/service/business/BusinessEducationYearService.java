package com.testinium.service.business;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.ExamGradeAndAvarageAllStudentsResponse;
import com.testinium.entity.EducationYear;
import com.testinium.entity.Student;
import com.testinium.repository.EducationYearRepository;
import com.testinium.repository.StudentRepository;
import com.testinium.service.EducationYearService;
import com.testinium.service.StudentsService;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
@Service
public class BusinessEducationYearService implements EducationYearService {

	private EducationYearRepository educationYearRepository;
	private ModelMapper modelMapper;

	


	/**
	 * @param studentRepository
	 * @param educationYearRepository
	 * @param modelMapper
	 */
	public BusinessEducationYearService( EducationYearRepository educationYearRepository,
			ModelMapper modelMapper) {
		this.educationYearRepository = educationYearRepository;
		this.modelMapper = modelMapper;
	}




	@Override
	public ResponseEntity<EducationYear> createEducationYear(EducationYear request) {
		educationYearRepository.save(request);
		
		return new ResponseEntity<>(request,HttpStatus.OK);		}

//	@Override
//	public AddStudentResponse createStudent(AddStudentRequest request) {
////		var existStudent = studentRepository.existsById(request.getIdentity());
//		if (existStudent) {
//		} else {
//				
//			var newStudent= studentRepository.save(modelMapper.map(request,Student.class));
//			return modelMapper.map(newStudent,AddStudentResponse.class);
//		}
//		return null;
//	}

//	@Override
//	public String createStudent2(AddStudentRequest request) {
//		
//	var newStudent= studentRepository.save(modelMapper.map(request,Student.class));
//		return "ok";
//	}

//	@Override
//	public ExamGradeAndAvarageAllStudentsResponse getAllStudentsByYearAndLessonCode(String year, String lessonCode) {
//		var existEducationYear= educationYearRepository.findByEducationYear(year);
//
//		if(existEducationYear!=null) {
//			
//			var getInformationSudent= studentRepository.findByYear(year);
//				getInformationSudent.getEducationYear()
//									.stream()
//									.map(edu->{
//										
//										var getStudent= ExamGradeAndAvarageAllStudentsResponse.class;
//										
//										return null;
//										
//										
//									})
//									.toList();
//		}
//		else {
//			
//		}
		
//	return null;
//}




}
