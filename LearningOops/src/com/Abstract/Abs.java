package com.Abstract;

public abstract class Abs {
   void m1() {
	   System.out.println("I am a Simple Method");
   }
 abstract void m2(); 
   
}

class Anotherclass extends Abs implements A {
	@Override
void m2() {
	System.out.println("Its abstract confusing");
	}
	@Override
	public void m3() {
		System.out.println("I am class");
	}
	@Override
	public  void tanuja() {
		System.out.println("She can do it!");
	}
}