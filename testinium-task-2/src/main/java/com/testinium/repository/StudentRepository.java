/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface StudentRepository extends JpaRepository<Student, String>{

}
