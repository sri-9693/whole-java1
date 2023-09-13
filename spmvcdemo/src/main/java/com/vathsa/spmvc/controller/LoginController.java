package com.vathsa.spmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vathsa.spmvc.beans.User;
import com.vathsa.spmvc.dao.UserDAO;
//import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController
{
	@Autowired
	UserDAO udao;
	
    @GetMapping("/loginPage")
    public String getLoginPage()
    {
        return "Login";
    }
    @PostMapping("/validateUser")
   
    public String authenticateUser(@RequestParam("uname")String username ,@RequestParam("pwd") String password,
    		             Model model,HttpServletResponse response)
    {
    	User user = new User(username,password);
    	//UserDAO udao = new UserDAO();
    	if(udao.searchUser(user))
    	{
    		response.addCookie(new Cookie("username",username));
    		return "Services";
    	}
    	String message="Invalid Username / password....Sorry";
    	model.addAttribute("userMessage",message);
    	return "Display";
    }
}







//public ModelAndView authenticateUser(@RequestParam("uname")String username ,@RequestParam("pwd") String password,Model model)
//{
//	String message="Invalid Username / password....Sorry";
//	if(username.equals("Ajay") && password.equals("Ajay@123"))
//	    message= "Hello "+username+" , Welcome to spring MVC World";
//  return new ModelAndView("Display","userMessage",message);
//}