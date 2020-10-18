package com.proj.alpha.shared.model;

public class Address {

	public String houseNo;
	public String streetName;
	public String city;
	public String state;
	public String zipcode;
	
	public Address(String houseNo, String streetName, String city, String state, String zipcode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	
}
