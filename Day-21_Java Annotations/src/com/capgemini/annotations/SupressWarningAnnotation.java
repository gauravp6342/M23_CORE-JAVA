package com.capgemini.annotations;
class Animal
{
	//Non-Parameterized Constructor
	Animal()
	{
		System.out.println("Dog");
	}
	/*public void sound()
	{
		System.out.println("Barks");
	}*/
}
public class SupressWarningAnnotation 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		//will remove the compiler warnings
		Animal a=new Animal();
	}
}
