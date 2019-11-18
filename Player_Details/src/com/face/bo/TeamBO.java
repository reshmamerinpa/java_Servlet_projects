package com.face.bo;

public class TeamBO {
	long teamId;
	String teamName;
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public TeamBO() {
		
	}
	public TeamBO(long teamId, String teamName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
	}
}
