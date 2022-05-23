package com.greentree.dev.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.greentree.dev.student.dal.entites.Student;
import com.greentree.dev.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	StudentRepository repo;
	
	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("Savan Kansgra");
		student.setCourse("Data Structure");
		student.setFee(new Double(20000));
		student.setId(100);
		repo.save(student);
	}
	
	@Test
	void testFindStudentById() {
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student= repo.findById(1l).get();
		student.setFee(400d);
		repo.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student = repo.findById(1l).get();
		repo.delete(student);
	}
	
	
	
}
