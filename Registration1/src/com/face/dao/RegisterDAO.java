package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import com.face.bo.RegisterBO;
import java.sql.Statement;

public class RegisterDAO {
 
	
	public static final RegisterDAO regdao=new RegisterDAO();
	public static void Save(Connection connection, RegisterBO regbo) throws SQLException {
		// TODO Auto-generated method stub
		Statement stmnt= connection.createStatement();
		String query="insert into register values('"+regbo.getName()+"','"+regbo.getEmail()+"','"+regbo.getMobile()+"','"+regbo.getPass()+"')";
	    int res=stmnt.executeUpdate(query);
	    if(res==1)
	    {
	    	System.out.println("Registered successfully");
	    }
	    else
	    {
	    	System.out.println("Registration Failed");
	    }
	}
	
	
}
