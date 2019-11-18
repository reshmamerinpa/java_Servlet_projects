package com.face.bo;

public class PlayerBO {
	String player;
	String country;
	String skill;
	/*public PlayerBO() {
		
	}
	public PlayerBO(String player, String country, String skill, String team) {
	//	super();
		this.player = player;
		this.country = country;
		this.skill = skill;
		this.team = team;
	}*/
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	String team;
}
