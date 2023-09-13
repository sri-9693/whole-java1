package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepo;

@RestController

@RequestMapping("/user")

@CrossOrigin(origins="http://localhost:4200")

public class UserController

{

	@Autowired

	private UserRepo repo;

	public ResponseEntity<?> loginUser(@RequestBody User userData)

	{

		User user=repo.findByUserId(userData.getUserId());

		if(user.getPassword().equals(userData.getPassword()))

			return ResponseEntity.ok(user);

		

		return (ResponseEntity<?>)ResponseEntity.internalServerError();

	

		

	}

 

}

 