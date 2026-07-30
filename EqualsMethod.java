package com.tnsif.accessmodifiers;
// demo for public , private , protected , default 
public class Test1 {
	
	public int s=5;
	
	//private String d="Dev";
	
	protected float g=5.6f;
	
	int y=80;
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		
		System.out.println(t.s);
//		System.out.println(t.d);
		System.out.println(t.g);
		System.out.println(t.y);
	}

}