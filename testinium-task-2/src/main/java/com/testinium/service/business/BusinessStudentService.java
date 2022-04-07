package com.testinium.service.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.testinium.configuration.ModelMapperConfiguration;
import com.testinium.dto.request.AddStudentRequest;
import com.testinium.dto.response.AddStudentResponse;
import com.testinium.entity.Student;
import com.testinium.repository.StudentRepository;
import com.testinium.service.StudentsService;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
public class BusinessStudentService implements StudentsService {

	@Autowired
	private StudentRepository studentRepository;
	private ModelMapperConfiguration modelMapper;

	/**
	 * @param studentRepository
	 */
	public BusinessStudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public AddStudentResponse createStudent(AddStudentRequest request) {
		var existStudent = studentRepository.existsById(request.getIdentity());
		if (existStudent) {
		} else {
				
			var newStudent= studentRepository.save(modelMapper.map(request,Student.class));
			return modelMapper.map(newStudent,AddStudentResponse.class);
		}
		return null;
	}

}
