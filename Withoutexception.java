package com.tnsif.constructorprogram;

class Student1 {
	int id;
	String name;
	
	Student1(int id, String name) {
		this.id=id;
		this.name=name;
		}
	void display() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		}
	}
public class Parameterprogram {
	public static void main(String[] args) {
		Student1 t=new Student1(1,"rohan");
		Student1 t1=new Student1(2,"go");
		
		t.display();
	    t1.display();
	    }
	}
