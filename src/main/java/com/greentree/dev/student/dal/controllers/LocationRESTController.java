package com.greentree.dev.student.dal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greentree.dev.student.dal.entites.Location;
import com.greentree.dev.student.dal.repos.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	LocationRepository locationRepository;
	
	@GetMapping
	public List<Location> getLocations() {
		return (List<Location>) locationRepository.findAll();
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
}
