package com.greentree.dev.flightcheckin.integration;

import com.greentree.dev.flightcheckin.integration.dto.*;

public interface ReservationRestClient {
	 public Reservation findReservation(Long id);
	 public Reservation updateReservation(UpdateReservationRequest request);
}
