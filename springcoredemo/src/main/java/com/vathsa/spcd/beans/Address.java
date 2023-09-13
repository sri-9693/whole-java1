package com.vathsa.spcd.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Component
@Controller
public class Address 
{
	private String hno="1-2-3";
	private String streetName="abc street";
	private String city="try city";
	private String state="catch state";
	public Address()  {}
	public Address(String hno, String streetName, String city, String state) 
	{
		this.hno = hno;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
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
	
			
	
}
