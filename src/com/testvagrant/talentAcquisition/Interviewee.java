package com.testvagrant.talentAcquisition;

public class Interviewee {

	private String name;
	private String experience;
	private String prevOrgName;
	private HiringDetails hiringDetailsInfo;

	public void setHiringInfo(HiringDetails hiringDetailsInfo) {
		this.hiringDetailsInfo = hiringDetailsInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public void setPrevOrgName(String prevOrgName) {
		this.prevOrgName = prevOrgName;
	}

	public String getPrevOrgName() {
		return prevOrgName;
	}

	public String getExperience() {
		return experience;
	}

	public HiringDetails getHiringDetailsInfo() {
		return hiringDetailsInfo;
	}

}
