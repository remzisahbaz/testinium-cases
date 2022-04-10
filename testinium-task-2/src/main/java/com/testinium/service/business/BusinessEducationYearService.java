package com.testinium.service.business;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testinium.dto.response.AddEducationYearResponse;
import com.testinium.dto.response.EducationYearResponse;
import com.testinium.entity.EducationYear;
import com.testinium.entity.Student;
import com.testinium.repository.EducationYearRepository;
import com.testinium.repository.StudentRepository;
import com.testinium.service.EducationYearService;

/**
 * 
 * @author Remzi ŞAHBAZ
 *
 */
@Service
public class BusinessEducationYearService implements EducationYearService {

	@Autowired
	private EducationYearRepository educationYearRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ModelMapper modelMapper;

	/**
	 * @param studentRepository
	 * @param educationYearRepository
	 * @param modelMapper
	 */
	public BusinessEducationYearService(EducationYearRepository educationYearRepository, ModelMapper modelMapper) {
		this.educationYearRepository = educationYearRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public AddEducationYearResponse createEducationYear(EducationYear request, String identity) {

		var getOneStudent=studentRepository.getOneStudentByIdentity(identity);
			request.setStudent(modelMapper.map(getOneStudent,Student.class));
			
		return modelMapper.map(educationYearRepository.save(request), AddEducationYearResponse.class);

	}

	@Override
	public EducationYearResponse getOneEducationYearByYear(String year) {

		var exist = educationYearRepository.findByYear(year);
		if (exist != null) {

			return modelMapper.map(exist,EducationYearResponse.class);
		}
		return null;
	}

	@Override
	public EducationYearResponse getOneEducationYearByStudentIdentity(String identity) {
		var exist = educationYearRepository.findByStudent(identity);
		if (exist != null) {

			return modelMapper.map(exist, EducationYearResponse.class);
		}
		return null;
	}

}
