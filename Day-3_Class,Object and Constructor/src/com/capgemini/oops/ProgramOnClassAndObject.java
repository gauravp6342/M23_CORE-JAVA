package com.capgemini.oops;
//demo non how to use the class and object
class Vehicle
{
	//variable
	int a;
	//user-define method
	void display()
	{
		System.out.println("Welcomde to M23 Batch");
	}
}


public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		//object Creation
		Vehicle obj=new Vehicle();
		//accessing the vehicle class method
		obj.display();
		obj.a=99;
		//accessing the vehicle class variable
		System.out.println(obj.a);

	}

}
