package com.testvagrant.talentAcquisition.builders;

import java.util.Date;

import com.testvagrant.talentAcquisition.HiringDetails;

public class HiringDetailsBuilder {

	HiringDetails hiringDetails = new HiringDetails();

	public HiringDetailsBuilder withDate(Date date) {
		hiringDetails.setHiringDate(date);
		return this;
	}

	public HiringDetailsBuilder withSelection(boolean select) {
		hiringDetails.setSelection(select);
		return this;
	}

	public HiringDetails build() {
		return hiringDetails;
	}
}
