package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.face.bo.PlayerBO;
import com.face.dao.PlayerDAO;
import com.face.dao.SkillDAO;
import com.face.util.ConnectionManager;

public class Player {
	String player;
	String country;
	String skill;
	String team;
	Player(){
		
	}
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public Player(String player, String country, String skill, String team) {
		super();
		this.player = player;
		this.country = country;
		this.skill = skill;
		this.team = team;
	}
	public void add() {
		// TODO Auto-generated method stub
		PlayerBO pbo=new PlayerBO();
		pbo.setPlayer(player);
		pbo.setCountry(country);
		pbo.setSkill(skill);
		pbo.setTeam(team);
		ConnectionManager conn=new ConnectionManager();
		try {
			Skill s=new Skill(skill);
			Team t=new Team(team);
			int skillId=s.getSkillName(conn.getConnection());
			int teamId=t.getTeamId(conn.getConnection());
			PlayerDAO.createPlayer(conn.getConnection(),pbo,skillId,teamId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void list() throws SQLException, Exception {
		ConnectionManager conn=new ConnectionManager();
		// TODO Auto-generated method stub		//List<Player>getAllPlayerDetails();
		PlayerDAO.getAllPlayerDetails(conn.getConnection());
		}


		public void searchplayer() throws SQLException, Exception {
			ConnectionManager conn=new ConnectionManager();
		System.out.println("enter the skill");
		skill=br.readLine();
		PlayerDAO.getplayerdetails(conn.getConnection(),skill);
		}

		
	
	
	
}
