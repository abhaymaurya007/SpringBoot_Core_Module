package com.nit.Components;

import org.springframework.stereotype.Component;

@Component("mrfBat")
public class MRFBat implements ICricketBat {

	@Override
	public int scoreRuns() {
		System.out.println("MRFBat.scoreRuns()");
		int score = (int) (Math.random() * 100);
		return score;
	}

}
