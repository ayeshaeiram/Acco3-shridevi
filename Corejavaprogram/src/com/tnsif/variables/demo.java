package com.tnsif.variables;
// demo for object creation
public class demo {

	String name; //declaration
	int price;
	
	void display() { // method
		System.out.println("food name: "+ name);
		System.out.println("Food price: "+price);
	}
   //main method
	public static void main(String[] args) {
		//create a object
		demo d1=new demo();
		d1.name="nezzha";
		d1.price=90;
		
		demo d2=new demo ();
		d2.name="hidzz";
		d2.price=60;
		
		d1.display(); // method call
		d2.display();
	}
}
