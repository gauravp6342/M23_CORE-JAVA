package com.capgemini.lambdaexpression;
//functional interface->contains only one abstract method
interface A
{
	void print();//abstract method
}
//length of code is increased using implementable class B
/*class B implements A
{
	@Override
	public void print() 
	{
		System.out.println("Functional Interface Implementation without lambda expression");
	}	
}*/
public class FunctionalInterfaceImplementation
{
	public static void main(String[] args) 
	{
		/*B b=new B();
		b.print();*/
		//1.lambda expression implements the functional interface
		//2.length of the code is decreased using lambda expression
		A obj=()->
		{
			System.out.println("Functional Interface Implementation without lambda expression");
		};
		obj.print();
	}
}
