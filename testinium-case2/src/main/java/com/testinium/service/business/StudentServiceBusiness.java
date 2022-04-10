package com.testinium.service.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testinium.entity.Student;
import com.testinium.repository.StudentRepository;
import com.testinium.service.StudentService;

@Service
public class StudentServiceBusiness implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	
	/**
	 * @param studentRepository
	 */
	public StudentServiceBusiness(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	@Override
	public Optional<Student> createStudent(Student student) {
		
		var exist =studentRepository.existsById(student.getSchoolNo());
		if(!exist ) {
		
		return Optional.ofNullable(Optional.of(studentRepository.save(student)).orElseThrow(()->new IllegalArgumentException("beklenmeyen hata")));
		}
		
		return Optional.ofNullable(null);
	}


}
