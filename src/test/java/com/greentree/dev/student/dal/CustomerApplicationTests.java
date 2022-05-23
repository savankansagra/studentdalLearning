package com.greentree.dev.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.greentree.dev.student.dal.entites.Customer;
import com.greentree.dev.student.dal.repos.CustomerRepository;

@SpringBootTest
public class CustomerApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setId(28l);
		customer.setCname("Kansagra");
		customer.setCemail("savan@greentree.dev");
		customerRepository.save(customer);
	}
	
	@Test
	void testFindCustomerById() {
		Customer customer =  customerRepository.findById(10l).get();
		System.out.println(customer);
	}
	
	@Test
	void testUpdateCustomerById() {
		Customer customer = customerRepository.findById(10l).get();
		customer.setCemail("info@greentree.dev");
		customerRepository.save(customer);
	}
	
	
	@Test
	void testDeleteCustomer() {
		Customer cs = customerRepository.findById(10l).get();
		
	}

	
	
}
