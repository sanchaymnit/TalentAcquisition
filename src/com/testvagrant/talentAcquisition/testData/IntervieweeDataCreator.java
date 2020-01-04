package com.testvagrant.talentAcquisition.testData;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.testvagrant.talentAcquisition.HiringDetails;
import com.testvagrant.talentAcquisition.Interviewee;
import com.testvagrant.talentAcquisition.builders.HiringDetailsBuilder;
import com.testvagrant.talentAcquisition.builders.IntervieweeBuilder;

public class IntervieweeDataCreator {

	public List<Interviewee> createInterviewees() {

		List<Interviewee> createInterviewees = new ArrayList<>();
		HiringDetails hiringDetailsInfo1 = new HiringDetailsBuilder()
				.withDate(new GregorianCalendar(2019, Calendar.NOVEMBER, 10).getTime()).withSelection(false).build();
		HiringDetails hiringDetailsInfo2 = new HiringDetailsBuilder()
				.withDate(new GregorianCalendar(2019, Calendar.NOVEMBER, 15).getTime()).withSelection(false).build();
		HiringDetails hiringDetailsInfo3 = new HiringDetailsBuilder()
				.withDate(new GregorianCalendar(2019, Calendar.NOVEMBER, 21).getTime()).withSelection(true).build();
		HiringDetails hiringDetailsInfo4 = new HiringDetailsBuilder()
				.withDate(new GregorianCalendar(2019, Calendar.NOVEMBER, 25).getTime()).withSelection(true).build();
		HiringDetails hiringDetailsInfo5 = new HiringDetailsBuilder()
				.withDate(new GregorianCalendar(2019, Calendar.DECEMBER, 25).getTime()).withSelection(true).build();

		createInterviewees.add(new IntervieweeBuilder().withName("ABC").withExperience("4.5").withPrevOrgName("Sapient")
				.withHiringDetailsInfo(hiringDetailsInfo1).build());
		createInterviewees.add(new IntervieweeBuilder().withName("XYZ").withExperience("3.5")
				.withPrevOrgName("Cognizant").withHiringDetailsInfo(hiringDetailsInfo2).build());
		createInterviewees.add(new IntervieweeBuilder().withName("XYZ").withExperience("8.5")
				.withPrevOrgName("Cognizant").withHiringDetailsInfo(hiringDetailsInfo3).build());

		createInterviewees.add(new IntervieweeBuilder().withName("XYZ").withExperience("2.5").withPrevOrgName("Planit")
				.withHiringDetailsInfo(hiringDetailsInfo4).build());
		createInterviewees.add(new IntervieweeBuilder().withName("DEF").withExperience("11.5")
				.withPrevOrgName("Sapient").withHiringDetailsInfo(hiringDetailsInfo5).build());
		return createInterviewees;
	}

}
