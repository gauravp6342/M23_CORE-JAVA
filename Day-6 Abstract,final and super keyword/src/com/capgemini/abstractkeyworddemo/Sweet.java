package com.capgemini.abstractkeyworddemo;
//Concrete class
class Sweet extends Gulabjamun
{
	public Sweet()
	{
		System.out.println("I like Gulabjamun");
	}
	//non-abstract method
	public String taste()
	{
		return "Sweet";
	}
	//implementation for abstract method
	
	void print()
	{
		System.out.println("Sweet is Gulabjamun");
	}
	

}
