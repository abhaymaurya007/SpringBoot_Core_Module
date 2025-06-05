package com.nit.Components;

import org.springframework.stereotype.Component;

@Component("ssBat")
public class SSBat implements ICricketBat {

	@Override
	public int scoreRuns() {
		System.out.println("SSBat.scoreRuns()");
		int score = (int) (Math.random() * 100);
		return score;
	}

}
