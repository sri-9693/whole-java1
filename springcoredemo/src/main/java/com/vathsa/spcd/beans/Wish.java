package com.vathsa.spcd.beans;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Wish 
{
	private String message;
	public Wish() 
	{
		System.out.println("wish Bean/object created");
	}
	public Wish(String message)
	{
		this.message=message;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	

	
}
