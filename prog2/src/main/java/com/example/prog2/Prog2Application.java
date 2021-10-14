package com.example.prog2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nt.flyway01.FlightController;
import com.nt.flyway01.flightRepo;

@SpringBootApplication
public class Prog2Application {

	public static void main(String[] args) {
		SpringApplication.run(Prog2Application.class, args);
	}
	

}
