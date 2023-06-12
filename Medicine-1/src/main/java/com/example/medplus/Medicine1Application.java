package com.example.medplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:8080")

@SpringBootApplication
public class Medicine1Application {

	public static void main(String[] args) {
		  SpringApplication.run(Medicine1Application.class, args);
	}

}
