package com.greentree.dev.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.greentree.dev.student.dal.entites.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Integer> {
}
