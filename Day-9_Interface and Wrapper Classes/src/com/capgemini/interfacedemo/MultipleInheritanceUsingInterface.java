package com.capgemini.interfacedemo;
//Multiple Inheritance Using Interface
interface Father
{
	void property();
}
interface Mother
{
	void love();
}
class Son implements Father,Mother
{
	@Override
	public void love()
	{
		System.out.println("Mother loves their child");
	}
	
	@Override
	public void property()
	{
		System.out.println("Father gives property to child");
	}	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Son s=new Son();
		s.love();
		s.property();
	}
}
