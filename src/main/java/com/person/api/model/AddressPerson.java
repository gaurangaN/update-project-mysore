package com.person.api.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.MultiValueMap;

@Entity
@Table
public class AddressPerson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String location;
	private String address;
	private LocalDate createdDate;
	private Integer personId;
	

	public AddressPerson( String location, String address, LocalDate createdDate, Integer personId) {
		super();
		this.location = location;
		this.address = address;
		this.createdDate = createdDate;
		this.personId = personId;
	}

/*	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}*/

	public AddressPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressPerson(String location, String address, LocalDate createdDate) {
		super();
		this.location = location;
		this.address = address;
		this.createdDate = createdDate;
	}

/*	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
*/
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	
	
	

}
