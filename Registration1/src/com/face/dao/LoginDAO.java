package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;

public class LoginDAO {

	public static boolean Save(Connection connection, LoginBO logbo) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmnt=connection.createStatement();
		boolean status=false;
		String query="select * from register where name ='"+logbo.getUname()+"' and password='"+logbo.getPwd()+"'";
		
		
		        ResultSet result = stmnt.executeQuery(query);
		        if(result.next())
		        {
		            System.out.println("LoginSuccessful");
		            String name=result.getString("name");
		            String email=result.getString("email");
		            String mobile=result.getString("mobile");
		            status=true;
		            
		           logbo.setName(name);
		           logbo.setEmail(email);
		           logbo.setMobile(mobile);
		        }else{
		        	
		        System.out.println("username and password are incorrect");
		       
		        }
		        return status;
	}
	
	

}
