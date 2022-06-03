package com.greentree.dev.flightreservation.services;

import com.greentree.dev.flightreservation.dto.ReservationRequest;
import com.greentree.dev.flightreservation.entites.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
}
