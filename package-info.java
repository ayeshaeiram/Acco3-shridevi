package com.tnsif.Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
public static void main(String[] args) {
	List<String> f=new ArrayList<String>();
	
	//add the data Add()
	f.add("apple");
	f.add("Mango");
	f.add("orange");
	f.add("mango");
	f.add("orange");
	f.add("mango");
	
	System.out.println(f);
	
	f.set(1, "Cherry");
	System.out.println(f);
	
	for(String g:f) {
		System.out.println(g);
	}
	
	System.out.println(f.remove(4));
	System.out.println(f);
	
}
}