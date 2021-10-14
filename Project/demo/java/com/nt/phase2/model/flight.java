package com.nt.phase2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity                                               //to create table based on the class fields
public class flight {
	@Id                                              // to assign primary for this field 
	private int flightId;
	private String source;
	private String destination;
	private LocalDateTime departure;
	private LocalDateTime arrival;
	public flight(int flightId, String source, String destination, LocalDateTime departure, LocalDateTime arrival) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.departure = departure;
		this.arrival = arrival;
	}
	public flight() {
		
	}
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getDeparture() {
		return departure;
	}
	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}
	public LocalDateTime getArrival() {
		return arrival;
	}
	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}
	@Override
	public String toString() {
		return "flight [flightId=" + flightId + ", source=" + source + ", destination=" + destination + ", departure="
				+ departure + ", arrival=" + arrival + "]";
	}
	
	
	
	
	
	

}
