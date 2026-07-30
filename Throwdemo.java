package com.tnsif.constructorprogram;

public class Bookdetails {
	
	Bookdetails() {
		System.out.println("welcome to java");
	}
	Bookdetails(int i,String n){
		System.out.println("hello world");
	}
	Bookdetails (int i){
		System.out.println("hi");
	}
	Bookdetails(int i, float n) {
		System.out.println("good");
		
	}
	public static void main(String[] args) {
		Bookdetails b=new Bookdetails ();
		Bookdetails b1=new Bookdetails (1,9.0f);
		Bookdetails b2=new Bookdetails(2,"nezz");
	}

}
