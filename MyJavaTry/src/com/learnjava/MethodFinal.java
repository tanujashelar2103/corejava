package com.learnjava;
//{we  overload  final method but cannot override)
//Fin

public class MethodFinal {
  final void add(int a,int b) {
	 int c = a + b;
	 System.out.println("The addition is "+c);
			
 }
}
//class Learn extends  MethodFinal{   //final class cannot extends
//	void add(int e, int f) {
//		 int g= e + f;
//		 System.out.println("The addition is "+g);
		

    class Learn extends  MethodFinal{
		void add(double e, double f) {
		double g= e + f;
		System.out.println("The addition is "+g);
				
	
}
}
