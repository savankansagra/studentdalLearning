package com.greentree.dev.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greentree.dev.flightreservation.entites.Flight;

public interface FightRepository extends JpaRepository<Flight, Long> {

}
