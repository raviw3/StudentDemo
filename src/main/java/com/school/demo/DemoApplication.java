package com.school.demo;

import com.school.demo.model.Student;
import com.school.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student s1 = Student.builder().firstName("John").lastName("Smith").std(1).score(80).build();
//		studentRepository.save(s1);
//		Student s2 = Student.builder().firstName("Mary").lastName("Jane").std(1).score(80).build();
//		studentRepository.save(s2);
	}
}
