package com.tnsif.Collectionframework;

import java.util.Stack;

//demo for stack

public class Stackdemo {
	
	public static void main(String[] args) {
		Stack<String> books=new Stack<>();
		
		//add the data push()
		
		books.push("java");
		books.push("python");
		books.push("react");
		books.add("java");
		books.push("python");
		books.push("react");
		System.out.println(books);
		
		//peek()
		System.out.println("top book "+books.peek());
		
		//search()
		System.out.println(books.search("java"));
		
		//pop()
		System.out.println(books.pop());
		
		System.out.println(books);
		
		System.out.println(books.size());
	}
}