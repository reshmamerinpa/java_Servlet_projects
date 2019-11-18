package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.face.bo.PlayerBO;

public class Main {
	public static void main(String[] args) throws SQLException, Exception {
		//char op=' ';
		Player p=new Player();
		int ch;
		boolean status=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
		
			System.out.println("Menu");
			System.out.println("1.List all players");
			System.out.println("2.Add new player");
			System.out.println("3.Search player");
			System.out.println("4.Exit");
			
			System.out.println("Enter your option");
			ch=Integer.parseInt(br.readLine());
			//System.out.println("Do you want to continue(Y|N)");
			//op=
			switch(ch) {
			case 1:  p.list();
				   break;
			case 2:collectDetails();
			       break;
			case 3:p.searchplayer();
			 		break;
			case 4:System.exit(0);
			}
		}while(ch<=4);
			
	}
	private static void collectDetails() throws IOException {
		// TODO Auto-generated method stub
		//PlayerBO pbo=new PlayerBO();
		String player;
		String country;
		String skill;
		String team;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the player name");
		player=br.readLine();
		System.out.println("Enter the country");
		country=br.readLine();
		System.out.println("Enter the skill");
		skill=br.readLine();
		System.out.println("Enter the team name");
		team=br.readLine();
		Player p=new Player(player,country,skill,team);
		p.add();
		
	}
	
}
