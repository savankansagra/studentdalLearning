package com.greentree.dev.student.dal.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greentree.dev.student.dal.entites.Vendor;
import com.greentree.dev.student.dal.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorRepository vendorRepository;
	
	@Override
	public Vendor getVendorById(int id) {
		return vendorRepository.findById(id).get();
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> allVendor = new ArrayList<Vendor>();
		Iterator<Vendor> iterator = vendorRepository.findAll().iterator();
		while(iterator.hasNext()) {
			allVendor.add(iterator.next());
		}
		return allVendor;
	}

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorRepository.delete(vendor);
	}

}
