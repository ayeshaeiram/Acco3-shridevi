package com.tnsif.Collectionframework;

import java.util.LinkedList;

//demo for linkedlist
public class Linkedlistdemo {
public static void main(String[] args) {
	
	LinkedList<String> a1=new LinkedList<>();
	
	a1.add("Mejstic");
	a1.add("Jayanagar");
	a1.add("JP nagar");
	
	//addfirst
	
	a1.addFirst("nelamangala");
	a1.addLast("mg road");
	
	//offer 
	
	a1.offer("attibele");
	System.out.println(a1);
	a1.removeLast();
	System.out.println(a1);
}
}