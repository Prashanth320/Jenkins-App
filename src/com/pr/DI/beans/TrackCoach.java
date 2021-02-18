package com.pr.DI.beans;

import com.pr.DI.Interfaces.Coach;
import com.pr.DI.Interfaces.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService theFortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 5KM per day";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
