package com.greentree.dev.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.greentree.dev.student.dal.entites.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
