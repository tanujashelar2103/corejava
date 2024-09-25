package com.learnjava;
//Final variables cannot be redeclared or reassigned
//Final method cannot be overridden{Same class name and different parameters}
//Final class cannot be extended
//Final keywords are written in capitals for better understanding

public class LearnFinal {
	 final int MAXSPEED = 54;
	
	void speed() {
		//maxSpeed= 60{This will not show as we have assigned Final keyword}
		System.out.println("The maximum speed is "+MAXSPEED);
	}
 public static void main(String[] args) {
	LearnFinal l = new LearnFinal();
    l.speed();
	}
}
