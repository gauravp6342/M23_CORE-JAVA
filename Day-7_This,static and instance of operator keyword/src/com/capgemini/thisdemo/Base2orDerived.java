package com.capgemini.thisdemo;

public class Base2orDerived extends Base1
{
	//Default Constructor
	Base2orDerived()
	{
		System.out.println("Default Constructor For Derived");
	}
	//Parameterized Constructor
	Base2orDerived(int i)
	{
		this();
		System.out.println("Parameterized Constructor For Derived" +i);
	}
}
