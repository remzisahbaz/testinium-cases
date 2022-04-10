package com.testinium;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestiniumTask2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestiniumTask2Application.class, args);
		
		List<String> a= new ArrayList<>();
		List<String> b= new ArrayList<>();
		
		a.addAll(b);
		
	}

}
