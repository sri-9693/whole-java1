package com.vathsa.spcd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.vathsa.spcd.beans.Address;
import com.vathsa.spcd.beans.Person;

@Configuration
@ComponentScan(basePackages="com.vathsa.spcd.beans")
public class AppConfig
{

 
}








//@Bean
//@Scope("prototype")
//public Address address()
//{
//	return new Address("1-2-3","SN street","Hyderabad","Telangana");
//}
//@Bean
//public Person person()
//{
//   Person p = new Person();
//   p.setSsn(101);
//   p.setName("Vijay");
//   p.setAge(23);
//   return p;
//}