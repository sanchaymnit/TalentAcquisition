package com.testvagrant.talentAcquisition.builders;

import com.testvagrant.talentAcquisition.HiringDetails;
import com.testvagrant.talentAcquisition.Interviewee;

public class IntervieweeBuilder {

	Interviewee interviewee = new Interviewee();

	public IntervieweeBuilder withName(String name) {
		interviewee.setName(name);
		return this;
	}

	public IntervieweeBuilder withExperience(String experience) {
		interviewee.setExperience(experience);
		return this;
	}

	public IntervieweeBuilder withPrevOrgName(String prevOrgName) {
		interviewee.setPrevOrgName(prevOrgName);
		return this;
	}

	public Interviewee build() {
		return interviewee;
	}

	public IntervieweeBuilder withHiringDetailsInfo(HiringDetails hiringDetailsInfo) {
		interviewee.setHiringInfo(hiringDetailsInfo);
		return this;
	}

}
