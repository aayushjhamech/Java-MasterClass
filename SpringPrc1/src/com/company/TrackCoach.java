package com.company;

public class TrackCoach implements Coach {
	
		private FortuneService fortuneService;
		
		public TrackCoach() {
		}

		public TrackCoach(FortuneService fortuneService) {
		
			this.fortuneService = fortuneService;
		}
		

		public String getDailyWorkout() {
			return "30 mins of Running";
		}

		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			return "I have to do it: " +fortuneService.getFortune();
		}
}
