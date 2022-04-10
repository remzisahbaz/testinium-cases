/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.dto.request.resultsOfExamRequest;
import com.testinium.entity.CourseRegistration;
import com.testinium.entity.ResulstOfExam;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface CourseregistrationRepository extends JpaRepository<ResulstOfExam, Long> {

}
