package com.pr.DI.beans;

import com.pr.DI.Interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will get to play in Olympics";
	}

}
