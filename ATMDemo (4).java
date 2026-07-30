package com.tnsif.constructorprogram;

class Student {
	int id;
	String name;
	
	Student() {
		id=101;
		name="hidzz";
	}
	void display() {
		System.out.println("id "+id);
		System.out.println("name "+name);
	}
}

public class StudentMain {
public static void main(String[] args) {
	Student s=new Student();
	s.display();
	}

}
