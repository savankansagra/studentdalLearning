package com.greentree.dev.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greentree.dev.flightreservation.entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
