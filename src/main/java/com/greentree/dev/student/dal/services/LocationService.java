package com.greentree.dev.student.dal.services;

import java.util.List;

import com.greentree.dev.student.dal.entites.Location;

public interface LocationService {
	Location getLocationById(int id);
	List<Location> getAllLocation();
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	List<Object[]> findTypeAndTypeCount();
}
