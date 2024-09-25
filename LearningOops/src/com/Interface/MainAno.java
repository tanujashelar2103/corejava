package com.Interface;

public class MainAno {
	public static void main(String[] args) {
		Anonymous opera = new Anonymous() {

			@Override
			public float performOperation(int num1, int num2) {
				
				return num1+num2;
			}
			
		
	};
	
	{
		Anonymous oper = new Anonymous() {

			@Override
			public float performOperation(int num1, int num2) {
				return num1-num2;
			}

	};
	      
	Anonymous ope = new Anonymous() {

		@Override
		public float performOperation(int num1, int num2) {
			return num1%num2;
		}
		
	};
    
     Anonymous op = new Anonymous() {

		@Override
		public float performOperation(int num1, int num2) {
			return num1*num2;
		}
    	 
     };
   
     Anonymous o = new Anonymous() {

		@Override
		public float performOperation(int num1, int num2) {
			return num1/num2;
		}
    	 
     };

	
	
		System.out.println("Addition is "+ opera.performOperation(24, 46));
        System.out.println("Substraction is "+oper.performOperation(58, 21));
        System.out.println("Modulus is " +ope.performOperation(112, 12));
        System.out.println("Multiplication is "+op.performOperation(848, 51));
        System.out.println("Division is " +o.performOperation(147, 16));
}
}
}
