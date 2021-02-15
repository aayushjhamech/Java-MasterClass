package com.company;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("No Arg constructor");
	}
	
	
	//setter method for setter injection using spring
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling 5hrs a day";
	}

	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
