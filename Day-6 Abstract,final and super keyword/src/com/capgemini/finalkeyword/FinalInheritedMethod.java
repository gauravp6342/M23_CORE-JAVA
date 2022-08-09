package com.capgemini.finalkeyword;
class Car
{
	String name;
	//final method is inherited but not override
	final void print(String name)
	{
		System.out.println("My name is : "+name);
	}
}
class Lamborgini extends Car
{
	
}
public class FinalInheritedMethod {

	public static void main(String[] args) {
		Lamborgini l=new Lamborgini();
		l.print("Lamborgini");
	}

}
