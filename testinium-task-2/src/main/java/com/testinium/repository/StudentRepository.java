/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.dto.response.StudentResponse;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

	StudentResponse getOneStudentByIdentity(String identity);


}
