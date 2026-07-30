package com.tnsif.exceptionhandling;

public class Arithematicexception {
public static void main(String[] args) {
	
	int num1=50/5;
	System.out.println(num1);
	int num2=50/10;
	System.out.println(num2);
	try {
		int num3=50/0;
		System.out.println(num3);
	}
	catch(ArithmeticException r) {
		System.out.println(r);
	}
	int num4=50/25;
	System.out.println(num4);
	
}
}