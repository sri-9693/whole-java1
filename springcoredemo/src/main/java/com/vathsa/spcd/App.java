package com.vathsa.spcd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vathsa.spcd.beans.Person;
import com.vathsa.spcd.config.AppConfig;

public class App 
{
	public static void main( String[] args )

    {

       AnnotationConfigApplicationContext container = new  AnnotationConfigApplicationContext(AppConfig.class);
       Person p = container.getBean(Person.class);
       System.out.println(p.getSsn()+" "+p.getName()+" "+p.getAge());
       System.out.println(p.getAddress().getHno()+" "+p.getAddress().getStreetName());
       System.out.println(p.getAddress().getCity()+" "+p.getAddress().getState());
       
       container.close();
    }
}



//Wish w1 = container.getBean("wish1",Wish.class);
//System.out.println(w1.getMessage());
//Wish w2 = container.getBean("wish1",Wish.class);
//w2.setMessage("spring welcomes you");
//System.out.println(w1.getMessage());
//System.out.println(w2.getMessage());
//
//Person p = container.getBean("per1",Person.class);
//System.out.println(p.getSsn()+" "+p.getName()+" "+p.getAge());
//System.out.println(p.getAddress().getHno()+" "+p.getAddress().getStreetName());
//System.out.println(p.getAddress().getCity()+" "+p.getAddress().getState());