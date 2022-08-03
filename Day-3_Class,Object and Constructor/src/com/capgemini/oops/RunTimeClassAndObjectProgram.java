package com.capgemini.oops;

import java.util.Scanner;

class Car
{
	//variable
	public int a;
	//user-define method
	void display()
	{
		System.out.println("Welcomde to M23 Batch");
	}
}
public class RunTimeClassAndObjectProgram {

	public static void main(String[] args) {
		
		Car obj=new Car();
		Car obj1=new Car();
		
		Scanner g1=new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		//int a=g1.nextInt();
		
		obj.a=g1.nextInt();
		obj1.a=g1.nextInt();
		//accessing the vehicle class method
		obj.display();
		
		
		//accessing the vehicle class variable
		System.out.println(obj.a);
		System.out.println(obj1.a);
		g1.close();

	}

}
