package com.greentree.dev.flightreservation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.greentree.dev.flightreservation.dto.UpdateReservationRequest;
import com.greentree.dev.flightreservation.entites.Reservation;
import com.greentree.dev.flightreservation.repos.ReservationRepository;

@RestController
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping(path = "/reservation/{id}")
	public Reservation findReservation(@PathVariable(value = "id") Long id) {
		Reservation reservationDetails = reservationRepository.findById(id).get();
		return reservationDetails;
	}
	
	@RequestMapping(path="/updateReservation",method = RequestMethod.POST)
	public Reservation updateReservation(@RequestBody UpdateReservationRequest request) {
		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		Reservation updatedReservation = reservationRepository.save(reservation);
		return updatedReservation;
	}
}
