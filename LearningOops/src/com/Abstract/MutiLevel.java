package com.Abstract;

public class MutiLevel {
		void score() {
			System.out.println("I can score");
		}
	}
	class  Bad extends MutiLevel {
		void makescore() {
			System.out.println("I will score");
		}
	}
		class Good extends MutiLevel  {
			void makescore1() {
				System.out.println("I want to score");
			}
		

}

