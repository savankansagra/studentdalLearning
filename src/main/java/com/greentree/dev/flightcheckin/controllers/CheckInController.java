package com.greentree.dev.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greentree.dev.flightcheckin.integration.ReservationRestClient;
import com.greentree.dev.flightcheckin.integration.dto.Reservation;
import com.greentree.dev.flightcheckin.integration.dto.UpdateReservationRequest;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationRestClient reservationRestClient;
	
	
	@RequestMapping(path = "/showStartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping(path = "/startCheckIn")
	public String startCheckIn(@RequestParam(name = "reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = reservationRestClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}
	
	@RequestMapping(path = "/completeCheckIn")
	public String completeReservation(@RequestParam(name = "id") String id, @RequestParam(name="numberOfBags") int numberOfBag ) {
		UpdateReservationRequest updateReservation = new UpdateReservationRequest();
		updateReservation.setId(Long.valueOf(id));
		updateReservation.setCheckedIn(true);
		updateReservation.setNumberOfBags(numberOfBag);
		Reservation updatedReservation = reservationRestClient.updateReservation(updateReservation);
		
		return "checkInConfirmation";
	}
}
