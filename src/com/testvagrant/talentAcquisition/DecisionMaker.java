package com.testvagrant.talentAcquisition;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.testvagrant.talentAcquisition.testData.IntervieweeDataCreator;

public class DecisionMaker {

	public static void main(String[] args) {
		List<Interviewee> allinterviewees = new IntervieweeDataCreator().createInterviewees();

		Date fromDate = new GregorianCalendar(2019, Calendar.NOVEMBER, 01).getTime();
		Date toDate = new GregorianCalendar(2019, Calendar.NOVEMBER, 30).getTime();

		List<Interviewee> interviewees = intervieweesWithinTheDateRange(allinterviewees, fromDate, toDate);

		int oneToFive = 0;
		int fiveToTen = 0;
		int tenToFifteen = 0;
		HashSet<String> hiredCompanies = new HashSet<>();
		for (Interviewee p : interviewees) {

			int exp = Integer.valueOf(p.getExperience());
			hiredCompanies.add(p.getPrevOrgName());
			if (exp >= 1 && exp <= 5) {
				oneToFive++;
			} else if (exp >= 5 && exp <= 10) {
				fiveToTen++;
			} else if (exp >= 10 && exp <= 15) {
				tenToFifteen++;
			}
		}

		System.out.println("People hired in 1-5 years experience range: " + oneToFive);
		System.out.println("People hired in 5-10 years experience range: " + fiveToTen);
		System.out.println("People hired in 10-15 years experience range: " + tenToFifteen);
		System.out.println("Companies we hired from: " + hiredCompanies);
	}

	private static List<Interviewee> intervieweesWithinTheDateRange(List<Interviewee> allinterviewees, Date fromDate,
			Date toDate) {

		return allinterviewees.stream()
				.filter(interviewee -> interviewee.getHiringDetailsInfo().getHiringDate().after(fromDate)
						&& interviewee.getHiringDetailsInfo().getHiringDate().before(toDate))
				.collect(Collectors.toList());
	}

}
