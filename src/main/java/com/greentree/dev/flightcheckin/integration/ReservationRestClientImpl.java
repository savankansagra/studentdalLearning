package com.greentree.dev.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.greentree.dev.flightcheckin.integration.dto.Reservation;
import com.greentree.dev.flightcheckin.integration.dto.UpdateReservationRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/reservation/"+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(UpdateReservationRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/updateReservation", request, Reservation.class);
		return reservation;
	}

}
