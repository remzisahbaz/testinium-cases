package com.testinium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class TestiniumCase2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestiniumCase2Application.class, args);
		
//		var newStudent= new demoDatabase();
//			newStudent.students();
	}

}
