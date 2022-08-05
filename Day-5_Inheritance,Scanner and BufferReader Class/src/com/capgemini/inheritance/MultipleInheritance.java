package com.capgemini.inheritance;
//program on multilevel inheritance
//parent class 1
class Car
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive fast");
	}
	
}
//Parent class for XUV700 and child class of car
class XUV extends Car
{
	protected String color;
	void print()
	{
		System.out.println("Speed is: "+speed);
	}
}
class XUV700 extends XUV
{
	void accept()
	{
		System.out.println("Color is: "+color);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		XUV700 x=new XUV700();
		x.color="White";
		x.speed=170;
		x.accept();
		x.display();
		x.print();

	}

}
