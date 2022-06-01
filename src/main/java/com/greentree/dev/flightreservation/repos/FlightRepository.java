package com.greentree.dev.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greentree.dev.flightreservation.entites.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query(value = "SELECT * FROM FLIGHT fl WHERE fl.DEPARTURE_CITY=:from AND fl.ARRIVAL_CITY=:to AND DATE_OF_DEPARTURE=:departureDate", 
			nativeQuery = true)
	List<Flight> findFlights(@Param("from") String from, @Param("to") String to,@Param("departureDate") Date departureDate);

}
