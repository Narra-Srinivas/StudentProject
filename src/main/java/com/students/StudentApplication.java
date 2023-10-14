package com.students;

import com.students.entity.students;
import com.students.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication{
	public static void main(String[] args)   {
		SpringApplication.run(StudentApplication.class, args);
	}

//	@Autowired
//	private studentRepository studentRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		students student1 = new students("Srinivas", "Narra", "narrabobby@gmail.com");
//		studentRepository.save(student1);
//		students student2 = new students("bobby", "Narra", "narrabobby@gmail.com");
//		studentRepository.save(student2);
//		students student3 = new students("Gopi", "Nuthalapati", "narrabobby@gmail.com");
//		studentRepository.save(student3);
//
//	}
}
