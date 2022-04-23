package com.example.simplespring1;

import com.example.simplespring1.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class Simplespring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Simplespring1Application.class, args);
	}



}
