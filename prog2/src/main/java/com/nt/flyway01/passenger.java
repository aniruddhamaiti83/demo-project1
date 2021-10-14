package com.nt.flyway01;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class passenger {
		@Id
		private int Id;
		private String name;
		private String email;
		private long phone;
		private int flightId;
		public passenger(int id, String name, String email, long phone, int flightId) {
			super();
			Id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.flightId = flightId;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public int getFlightId() {
			return flightId;
		}
		public void setFlightId(int flightId) {
			this.flightId = flightId;
		}
		@Override
		public String toString() {
			return "passenger [Id=" + Id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", flightId="
					+ flightId + "]";
		}
		
		
	
}

