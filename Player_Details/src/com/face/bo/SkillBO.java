package com.face.bo;

public class SkillBO {
	long skillId;
	String skillName;
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public SkillBO() {
		
	}
	public SkillBO(long skillId, String skillName) {
	//	super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
}

