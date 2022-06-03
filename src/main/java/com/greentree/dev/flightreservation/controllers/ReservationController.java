package com.greentree.dev.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.greentree.dev.flightreservation.dto.ReservationRequest;
import com.greentree.dev.flightreservation.entites.Flight;
import com.greentree.dev.flightreservation.entites.Reservation;
import com.greentree.dev.flightreservation.repos.FlightRepository;
import com.greentree.dev.flightreservation.services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long flightId, ModelMap modelmap) {
		Flight flight = flightRepository.findById(flightId).get();
		modelmap.addAttribute("flight", flight);
		
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation",method = RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation bookFlightReservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created sucessfully and the id is "+bookFlightReservation.getId());
		return "reservationConfirmation";
	}
	
}
