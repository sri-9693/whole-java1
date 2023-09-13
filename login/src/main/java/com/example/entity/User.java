package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loginUser")
public class User 
{
	@Id
	@Column(name="user_id")
	private String userid;
	@Column(name="password")
	private String password;
	public User() {
		super();
	}



	public User(String userId, String password) {
		super();
		this.userid = userId;
		this.password = password;
	}

 

 

	public String getUserId() {
		return userid;
	}
	public void setUserId(String userId) {
		this.userid = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}