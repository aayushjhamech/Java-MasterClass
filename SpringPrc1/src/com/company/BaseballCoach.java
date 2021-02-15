package com.company;

public class BaseballCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	//Dependency injection using constructor
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "30 mins of Pitching";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


}
