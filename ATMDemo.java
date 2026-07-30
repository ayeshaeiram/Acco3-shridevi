package com.tnsif.Inheritanceprogram;
// demo for multilevel inheritance

class Animal{
	void eat() {
		System.out.println("animal eats food");
	}
}
// parent
class Dog extends Animal {
	
	void bark() {
		System.out.println("dog bark");
	}
	
}

//child class
class Puppy extends Dog {
	
	void play() {
		System.out.println("puppy play");
	}
}
public class Multileveldemo {
	public static void main(String[] args) {
		Puppy p=new Puppy();
		Dog d = new Dog();
		d.bark();
		p.play();
	}

}