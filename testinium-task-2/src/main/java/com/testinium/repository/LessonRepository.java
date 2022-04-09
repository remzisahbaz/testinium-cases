/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testinium.entity.Lesson;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface LessonRepository extends JpaRepository<Lesson,Long>{

}
