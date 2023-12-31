package org.anudip.hotelManagement.bean;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ClientServices {
	// Member data
	@Id
	//@Column(name = "serial_number")
	private Integer serialNumber;
	//@Column(name = "client_number")
	private Integer clientNumber;
	//@Column(name = "service_type")
	private String serviceType;
	private String date;
	private Double amount;
	
	// Constructors
	public ClientServices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClientServices(Integer serialNumber, Integer clientNumber, String serviceType, String date, Double amount) {
		super();
		this.serialNumber = serialNumber;
		this.clientNumber = clientNumber;
		this.serviceType = serviceType;
		this.date = date;
		this.amount = amount;
	}
	
	public ClientServices(Integer serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}
	// Getter and Setter Methods
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Integer getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(Integer clientNumber) {
		this.clientNumber = clientNumber;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}