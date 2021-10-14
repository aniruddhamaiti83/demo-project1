package com.nt.phase2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.phase2.dao.flightRepo;
import com.nt.phase2.model.flight;


public class FlightController {
	@Autowired                                   // indicate the flightrepo interface which is used for CRUD operations in database
	 flightRepo repo;
	
	@RequestMapping("/")                         //localhots:8081 --- indicates the browser to call the method--> to display the jsp
	public String home() {
		
		return "home.html";
	}
	
	@RequestMapping("/addFLight")
	public String addFlight(flight flight)
	{
		repo.save(flight);
		return "home.html";
	}
	
	@RequestMapping("/getFlight")
	public ModelAndView getAlien(@RequestParam int flightId)
	{
		ModelAndView mv = new ModelAndView("showalien.jsp");
		flight f1 = repo.findById(flightId).orElse(new flight());
		mv.addObject(f1);
		return mv;
	}
	

}
