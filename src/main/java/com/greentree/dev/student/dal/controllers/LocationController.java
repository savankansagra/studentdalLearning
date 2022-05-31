package com.greentree.dev.student.dal.controllers;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greentree.dev.student.dal.entites.Location;
import com.greentree.dev.student.dal.services.LocationService;
import com.greentree.dev.student.dal.util.EmailUtil;
import com.greentree.dev.student.dal.util.ReportUtil;

@Controller
public class LocationController {

	@Autowired
	LocationService service;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelmap) {
		Location locationSaved = service.saveLocation(location);
		modelmap.addAttribute("msg", "Location saved with id "+locationSaved.getId());
		int i=0;
		emailUtil.sendEmail("015coders015@gmail.com", "Location saved", "Location saved sucessfully and about to return a response");
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocation(ModelMap modelmap) {
		List<Location> allLocation = service.getAllLocation();
		modelmap.addAttribute("locations", allLocation);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelmap) {
		//Location locationById = service.getLocationById(id);
		Location locationById = new Location();
		locationById.setId(id);
		service.deleteLocation(locationById);
		List<Location> allLocation = service.getAllLocation();
		modelmap.addAttribute("locations", allLocation);
		
		return "displayLocations";
	}
	
	//"updateLocation?id=${location.id}"
	@RequestMapping("/showUpdate")
	public String updateLocationShow(@RequestParam("id") int id, ModelMap modelmap) {
		Location locationById = service.getLocationById(id);
		modelmap.addAttribute("location", locationById);
		return "editLocation";
	}

	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelmap) {
		service.updateLocation(location);
		List<Location> allLocation = service.getAllLocation();
		modelmap.addAttribute("locations", allLocation);	
		return "displayLocations";
	}
	
	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = servletContext.getRealPath("/");
		
		List<Object[]> data = service.findTypeAndTypeCount();
		reportUtil.generatePieChart(new File(path+"/pieChart.jpeg"), data);
		return "report";
	}
	
}
