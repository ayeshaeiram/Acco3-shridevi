package com.tnsif.exceptionhandling;
// demo for throw keyword

public class Throwdemo {
	
	public static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible for vote");
		}
		System.out.println("eligible for vote");
	}
	public static void main(String[] args) {
		try {
			checkAge(16);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
