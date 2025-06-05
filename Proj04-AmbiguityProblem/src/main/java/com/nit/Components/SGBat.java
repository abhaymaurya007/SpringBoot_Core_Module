package com.nit.Components;

import org.springframework.stereotype.Component;

@Component("sgBat")
public class SGBat implements ICricketBat {

	@Override
	public int scoreRuns() {
	System.out.println("SGBat.scoreRuns()");
		int score = (int) (Math.random() * 100);
		return score;
	}

}
