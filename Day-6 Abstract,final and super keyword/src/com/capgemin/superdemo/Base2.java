package com.capgemin.superdemo;

public class Base2 extends Base1
{
	Base2()
	{
		super();//call to parent class default constructor
		System.out.println("Default Constructor for Base2");
	}
	Base2(int i)
	{
		super(i);//call to parent class parameterized constructor
		System.out.println("Parameterized Constructor for Base2: "+i);
	}

}
