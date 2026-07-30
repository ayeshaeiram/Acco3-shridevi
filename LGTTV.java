package com.tnsif.exceptionhandling;

public class ArrayIndexdemo {
	public static void main(String[] args) {
		String employee[]= {"ravi","priya","kiran"};
		try {
			System.out.println(employee[5]);
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
		}
	}

}

