package com.tnsif.abstractionprogram;

class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("smart light on");
	}
	@Override
	public void turnOFF() {
		System.out.println("smart light off");		
	}
	@Override
	public void getStatus() {
		System.out.println("smart light is standy mood");
	}	
}
public class Interfacemain {
public static void main(String[] args) {
	SmartDevice d=new SmartLight();
	d.turnOn();
	d.turnOFF();
	d.getStatus();
}
}
