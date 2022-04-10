package com.testinium.service.business;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testinium.dto.response.AddStudentResponse;
import com.testinium.dto.response.StudentResponse;
import com.testinium.entity.Student;
import com.testinium.repository.StudentRepository;
import com.testinium.service.StudentsService;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
@Service
public class BusinessStudentService implements StudentsService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ModelMapper modelMapper;

	/**
	 * @param studentRepository
	 * @param modelMapper
	 */
	public BusinessStudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
		this.studentRepository = studentRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public AddStudentResponse createStudent3(Student request) {
		studentRepository.save(request);

		return modelMapper.map(studentRepository.save(request),AddStudentResponse.class);
	}

	@Override
	public StudentResponse getOneStudentByIdentity(String identity) {

		return modelMapper.map(studentRepository.findById(identity), StudentResponse.class);
	}

}
