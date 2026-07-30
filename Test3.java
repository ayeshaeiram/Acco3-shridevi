package com.tnsif.abstractionprogram;
// demo for abstraction

abstract class ATM{ //abstract class
	//abstract methods
	abstract void withdraw();
	
	abstract void deposit();
	
	//Concrete methods
	void display() {
		System.out.println("welcome to SBI ATM");
	}
}
class SBIATM extends ATM{
	@Override
	void withdraw() {
		System.out.println("Money withdraw sccessfully");
	}

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		
	}
}
public class ATMDemo {
	public static void main(String[] args) {
		SBIATM s=new SBIATM();
		
		s.deposit();
		s.withdraw();
		s.display();
	}
}

