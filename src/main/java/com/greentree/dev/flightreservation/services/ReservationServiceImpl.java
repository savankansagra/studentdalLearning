package com.greentree.dev.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greentree.dev.flightreservation.dto.ReservationRequest;
import com.greentree.dev.flightreservation.entites.Flight;
import com.greentree.dev.flightreservation.entites.Passenger;
import com.greentree.dev.flightreservation.entites.Reservation;
import com.greentree.dev.flightreservation.repos.FlightRepository;
import com.greentree.dev.flightreservation.repos.PassengerRepository;
import com.greentree.dev.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		//make payment
		
		//get flight 
		long flightId = request.getId();
		Flight flight = flightRepository.findById(flightId).get();
		
		//save passenger
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setMiddleName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		//save reservation
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false); //for check in, we use difference application
		Reservation savedReservation = reservationRepository.save(reservation);
		
		
		return savedReservation;
	}

}
