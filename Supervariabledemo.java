package com.tnsif.exceptionhandling;
// demo for equals method
public class EqualsMethods {
public static void main(String[] args) {
	
	String Storedname="Nisarga";
	String entername1="Nisarga";
	String entername2=new String("Nisarga");
	String entername3="Ankitha";
	
	String entername4="NISARGA";
	
	System.out.println(Storedname.equals(entername1));
	System.out.println(Storedname.equals(entername2));
	System.out.println(Storedname.equals(entername3));
	System.out.println(Storedname.equalsIgnoreCase(entername4));
	System.out.println(Storedname.equalsIgnoreCase(entername3));
}
}
