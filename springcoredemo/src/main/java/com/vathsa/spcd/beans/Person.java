package com.vathsa.spcd.beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@Component
@Service
public class Person 
{
	private int ssn;
	private String name;
	private int age;
	@Autowired
	private Address address;
	public Person()  {}
	public Person(Address address)
	{
		this.address=address;
	}
	public Person(int ssn, String name, int age, Address address)
	{
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	 
	public void setAddress(Address address) {
		this.address = address;
	}
	public void initPerson()
	{
		System.out.println("From initperson");
	}
	public void destPerson()
	{
		System.out.println("From destperson");
	}
	

}
