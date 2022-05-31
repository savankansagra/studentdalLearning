package com.greentree.dev.student.dal.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.greentree.dev.student.dal.entites.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

	@Query("select type, count(type) from Location group by type")
	public List<Object[]> getTypeAndTypeCount();
}
