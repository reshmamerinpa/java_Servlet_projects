package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.PlayerBO;
import com.face.util.ConnectionManager;

public class PlayerDAO {

	/*public static void insert(Connection connection, PlayerBO pbo) {
		// TODO Auto-generated method stub
		
	}
*/
	

	public static void createPlayer(Connection connection, PlayerBO pbo, int skillId, int teamId) {
		// TODO Auto-generated method stub
		try {
			Statement stmnt=connection.createStatement();
			String query="insert into player(name,country,skill_id,team_id)values('"+pbo.getPlayer()+"','"+pbo.getCountry()+"',"+skillId+","+teamId+")";
		//	System.out.println(query);
			int res=stmnt.executeUpdate(query);
			if(res==1) {
				System.out.println("Player has been added successfully");
			}
			else {
				System.out.println("Player has'nt been added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getAllPlayerDetails(Connection connection) throws SQLException {
		// TODO Auto-generated method stub
		try {
		Statement stmnt=connection.createStatement();
		String s="select * from player p,skill s, team t where p.skill_id=s.id and p.team_id=t.id ";
		ResultSet res=stmnt.executeQuery(s);
		System.out.println("---details----");
		System.out.println("Playername \t country \t skill \t team");
		while(res.next()) {
		System.out.println(res.getString("p.name")+"\t"+res.getString("country")+"\t"+res.getString("s.name")+"\t"+res.getString("t.name"));
		}

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

		public static void getplayerdetails(Connection connection, String skill) {
		// TODO Auto-generated method stub
		try {
		Statement stmnt=connection.createStatement();
		String s="select * from player p,skill s, team t where p.skill_id=s.id and p.team_id=t.id and s.name='"+skill+"'";
		ResultSet res=stmnt.executeQuery(s);
		System.out.println("---details----");
		System.out.println("Playername \t country \t skill \t team");
		while(res.next()) {
		System.out.println(res.getString("p.name")+"\t"+res.getString("country")+"\t"+res.getString("s.name")+"\t"+res.getString("t.name"));
		}

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

		}