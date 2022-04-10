/**
 * 
 */
package com.testinium.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.dto.response.EducationYearResponse;
import com.testinium.entity.EducationYear;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface EducationYearRepository extends JpaRepository<EducationYear, Long>{

	Optional<EducationYearResponse> findByYear(String year);

	Optional<EducationYearResponse> findByStudent(String identity);
	Optional<EducationYearResponse> findAllEducationYearByStudent(String identity);


}
