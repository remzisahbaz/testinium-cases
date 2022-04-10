package com.testinium.test.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testinium.TestiniumTask2Application;
import com.testinium.dto.request.AddStudentRequest;
import com.testinium.entity.Student;
import com.testinium.service.business.BusinessStudentService;

@SpringBootTest(
		classes = TestiniumTask2Application.class,
		webEnvironment = WebEnvironment.MOCK
	)
@AutoConfigureMockMvc
class StudentTest {

	@Autowired
	MockMvc mockMvc;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	ObjectMapper objectMapper;
	
	@MockBean
	BusinessStudentService businessStudentService;
	
	@DisplayName("get-Student-ByIdentity-Return-OK")
	@ParameterizedTest
	@CsvFileSource(resources = "students.csv")
	void getStudentByIdentityReturnOk(String identity, String fullName) {
		
		var studentrequest= new AddStudentRequest();
		studentrequest.setFullName(fullName);
		studentrequest.setIdentity(identity);
		var student=modelMapper.map(studentrequest,Student.class );
		
//			Mockito.when(businessStudentService.getOneStudentByIdentity(identity))
//												.thenReturn(StudentResponse);
//
		}
	
	
}
