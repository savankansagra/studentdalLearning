package com.greentree.dev.student.dal.services;

import java.util.List;

import com.greentree.dev.student.dal.entites.Vendor;

public interface VendorService {
	Vendor getVendorById(int id);
	List<Vendor> getAllVendor();
	Vendor saveVendor(Vendor vendor);
	Vendor updateVendor(Vendor vendor);
	void deleteVendor(Vendor vendor);	
}
