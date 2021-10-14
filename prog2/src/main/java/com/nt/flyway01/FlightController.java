package com.nt.flyway01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class FlightController {
		@Autowired
		flightRepo repo;
		
		@RequestMapping("/")
			public String home() {
				return "home.html";
			}
	
		@RequestMapping("/addFLight")
		public String addFlight(flight flight)
		{
			repo.save(flight);
			return "home.html";
		}
		
		public void insertFourFlights(flightRepo repository) {
		    repository.save(new flight(123,"kolkata","Delhi",LocalDateTime.now(),LocalDateTime.now()));//DateTimeFormatter.ofPattern("2021-01-01 22:22:22"),DateTimeFormatter.ofpa"2021-01-01 22:22:22"));
		    //repository.save(new Employee("Trisha", "Gee"));
		    //repository.save(new Employee("Helen", "Scott"));
		    //repository.save(new Employee("Mala", "Gupta"));
		}
		
		
		@RequestMapping("/getFlight")
		public ModelAndView getAlien(@RequestParam int flightId)
		{
			ModelAndView mv = new ModelAndView("showalien.html");
			flight f1 = repo.findById(flightId).orElse(new flight());
			mv.addObject(f1);
			return mv;
		}
		

	}

