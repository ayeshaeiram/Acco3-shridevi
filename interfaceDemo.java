package com.tnsif.Polymorphism;
// demo for methodoverloading

class Calculator{
	void add(int a,int b) {
		System.out.println("sum = "+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("sum ="+(a+b+c));
	}
	void add(double a, double b) {
		System.out.println("sum ="+(a+b));
	}
}
public class MethodoverlodingDemo {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10, 20);
		c.add(10.5, 11.5);
		c.add(3, 4,5);
	}

}
