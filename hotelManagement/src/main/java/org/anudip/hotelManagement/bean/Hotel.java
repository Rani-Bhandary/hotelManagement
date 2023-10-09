package org.anudip.hotelManagement.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	//MEMBER DATA
	@Id
	private String hotelId;
	private String hotelName;
	// Constructors
	public Hotel(String hotelId) {
		super();
		this.hotelId = hotelId;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}
	// Getter and Setter Methods
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	

}
