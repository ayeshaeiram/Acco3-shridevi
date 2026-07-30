package com.tnsif.constructorprogram;

 class Demo{
	 int length;
	 int breadth;
	 
	 Demo(int length,int breadth){
		 this.length=length;
		 this.breadth=breadth;
	 }
	 void Area()  {
		 System.out.println("Area "+(length*breadth));
	 }
 }
 public class Rectangledemo{
	 public static void main(String[] args) {
		 Demo d=new Demo(10,5);
		 d.Area(); 
	 }

}
