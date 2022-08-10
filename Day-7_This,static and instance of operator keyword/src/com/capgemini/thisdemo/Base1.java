package com.capgemini.thisdemo;

public abstract class Base1 
{
	//default constructor
	Base1()
	{
		this(32);
		System.out.println("Default onstructor for Base1: ");
	}
	//parameterized constructor
	Base1(int i)
	{
		System.out.println("Parameterized constructor for base1: "+i);
	}
}
