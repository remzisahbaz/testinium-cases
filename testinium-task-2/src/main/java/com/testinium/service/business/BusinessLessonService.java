/**
 * 
 */
package com.testinium.service.business;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testinium.dto.request.AddLessonRequest;
import com.testinium.dto.response.AddLessonResponse;
import com.testinium.entity.EducationYear;
import com.testinium.entity.Lesson;
import com.testinium.repository.EducationYearRepository;
import com.testinium.repository.LessonRepository;
import com.testinium.repository.StudentRepository;
import com.testinium.service.LessonService;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Service
public class BusinessLessonService implements LessonService {

	@Autowired
	private LessonRepository lessonRepository;
	@Autowired
	private EducationYearRepository educationRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ModelMapper modelMapper;

	
	
	/**
	 * @param lessonRepository
	 * @param educationRepository
	 * @param studentRepository
	 * @param modelMapper
	 */
	public BusinessLessonService(LessonRepository lessonRepository, EducationYearRepository educationRepository,
			StudentRepository studentRepository, ModelMapper modelMapper) {
		this.lessonRepository = lessonRepository;
		this.educationRepository = educationRepository;
		this.studentRepository = studentRepository;
		this.modelMapper = modelMapper;
	}



	@Override
	public AddLessonResponse createLesson(String identity, String year, AddLessonRequest request) {

		var existStudent = studentRepository.findById(identity);
		var existEducationYear = educationRepository.findByYear(year);

		if (existStudent.isPresent()) {
			if (existEducationYear.isPresent()) {
				var requestConvertLesson = modelMapper.map(request, Lesson.class);
				educationRepository.findAllEducationYearByStudent(identity).stream().map(edu -> {

					if (edu.getYear() == year) {
						
						System.out.println(edu);
						requestConvertLesson.setEducationYear(modelMapper.map(edu, EducationYear.class));
					}
					return lessonRepository.save(requestConvertLesson);
				})
				;

			}
		}
		else
			return null;
		return null;

	
		
}
	

}
