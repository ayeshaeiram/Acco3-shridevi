package com.tnsif.Inheritanceprogram;
// demo for single level inheritance
class Vehicle {
	void start() {
		System.out.println("Vehicle started");
	}
}

//child class
class Car extends Vehicle {
	void drive() {
		System.out.println("car is started");
	}
}

public class Singledemo {
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.drive();
	}

}
