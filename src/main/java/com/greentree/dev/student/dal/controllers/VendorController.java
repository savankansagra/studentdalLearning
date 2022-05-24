package com.greentree.dev.student.dal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greentree.dev.student.dal.entites.Vendor;
import com.greentree.dev.student.dal.services.VendorService;

@Controller
public class VendorController {
	
	@Autowired
	VendorService vendorService;
	
	/**
	 * Default view
	 * @return create page default view.
	 */
	@RequestMapping("createVendor")
	public String createVendor() {
		return "createVendor";
	}
	
	@RequestMapping("saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor vendorSaved = vendorService.saveVendor(vendor);
		String msg = "Vendor Created with id :"+vendorSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}
	
	@RequestMapping("displayVendors")
	public String displayAllVendors(ModelMap modelMap) {
		List<Vendor> allVendor = vendorService.getAllVendor();
		modelMap.addAttribute("vendors", allVendor);
		return "displayVendors";
	}
	
	@RequestMapping("deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		//Vendor vendorById = vendorService.getVendorById(id);
		Vendor vendorById = new Vendor();
		vendorById.setId(id);
		vendorService.deleteVendor(vendorById);
		
		//again display all the records back to screen
		List<Vendor> allVendor = vendorService.getAllVendor();
		modelMap.addAttribute("vendors", allVendor);
		return "displayVendors";
	}
	
	@RequestMapping("editVendor")
	public String editVendor(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendorById = vendorService.getVendorById(id);
		modelMap.addAttribute("vendor", vendorById);
		return "editVendor";
	}
	
	@RequestMapping("updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor vendorUpdate = vendorService.updateVendor(vendor);
		List<Vendor> allVendor = vendorService.getAllVendor();
		modelMap.addAttribute("vendors", allVendor);
		return "displayVendors";
	}
	
}
