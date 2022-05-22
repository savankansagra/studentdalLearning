package com.greentree.dev.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.greentree.dev.student.dal.entites.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
