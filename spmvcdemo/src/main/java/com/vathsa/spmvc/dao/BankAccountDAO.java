package com.vathsa.spmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDAO 
{
	private static String url="jdbc:mysql://localhost:3306/prolifics";
    public boolean updateBalance(String username,double amount)
    {
    	int count=0;
 	   Connection con = null;
 	   PreparedStatement pst = null;
 	   try 
 	   {
 		   Class.forName("com.mysql.jdbc.Driver");
 		   con = DriverManager.getConnection(url,"root","ecegcet@408..");
 		   pst = con.prepareStatement("update bankaccount set balance=balance-? where username=?");
 		   pst.setDouble(1,amount);
 		   pst.setString(2,username);
 		   count = pst.executeUpdate();
 	   }
 	   catch(Exception ex)
 	   {
 		   ex.printStackTrace();
 	   }
 	   finally
 	   {
 		   try
 		   {
 			   if(pst!=null) pst.close();
 			   if(con!=null) con.close();
 		   }
 		   catch(Exception ex)
 		   {
 			   ex.printStackTrace();
 		   }
 	   }
 	   return count == 1;
    }

    }

