package com.cdac.ads;

public class Assignment1_1 {

	static int factorial(int n) {
		
		if(n < 0) {
			throw new IllegalArgumentException("Factorial not defined for negative number");
			
		}
		
		if(n == 0 || n == 1) {
			
			return 1;
		}
		
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		
		try {
			
			int result = factorial(n);
			System.out.println("Factorail of "+ n + " is : " + result );
			
		}
		catch(IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
