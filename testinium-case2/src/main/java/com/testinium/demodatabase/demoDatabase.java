/**
 * 
 */
package com.testinium.demodatabase;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.testinium.entity.Student;
import com.testinium.repository.StudentRepository;

/**
 * @author remzi ŞAHBAZ
 *
 */
public class demoDatabase {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public Map<Integer, Student> students() {

		Map<Integer, Student> list = new HashMap<>();
		var s= new Student();
			s.setSchoolNo("A1001");
			s.setFullName("Remzi ŞAHBAZ");
		studentRepository.save(s);
		
		s.setSchoolNo("A1002");
		s.setFullName("Elif ŞAHBAZ");
	studentRepository.save(s);
		
		s.setSchoolNo("A1003");
		s.setFullName("Beyza ŞAHBAZ");
	studentRepository.save(s);
			
	return list;
	}
}
