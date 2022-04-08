/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.dto.request.GetInformantionStudent;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

	GetInformantionStudent findByYear(String year);

}
