package com.face.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SkillDAO {

	public static int FindBySkillName(Connection connection, String skill) {
		int skill_id=0;
		try {
			
			Statement stmnt=connection.createStatement();
			String query="select id from skill where name='"+skill+"'";
			ResultSet res=stmnt.executeQuery(query);
			while(res.next()) {
				skill_id=res.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return skill_id;
		// TODO Auto-generated method stub
		
	}
	
}
