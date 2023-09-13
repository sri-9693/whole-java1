package com.vathsa.spmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.vathsa.spmvc.beans.User;
@Repository
public class UserDAO 
{ 
	private static String url="jdbc:mysql://localhost:3306/prolifics";
   public boolean searchUser(User user)
   {
	   int count=0;
	   Connection con = null;
	   PreparedStatement pst = null;
	   ResultSet rs = null;
	   try 
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   con = DriverManager.getConnection(url,"root","ecegcet@408..");
		   pst = con.prepareStatement("select count(*) from users where username=? and password=?");
		   pst.setString(1,user.getUsername());
		   pst.setString(2,user.getPassword());
		   rs = pst.executeQuery();
		   if(rs.next()) 
			   count = rs.getInt(1);
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(rs!=null) rs.close();
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
