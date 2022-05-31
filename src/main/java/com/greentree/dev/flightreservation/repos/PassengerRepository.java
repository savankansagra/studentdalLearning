package com.greentree.dev.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greentree.dev.flightreservation.entites.Passenger;
import com.greentree.dev.flightreservation.entites.User;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
