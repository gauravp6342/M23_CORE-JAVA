package com.capgemini.exceptionhandling;

public class ThrowDemo 
{
	//throws keyword is used to declare an exception
	public static void display(int age,int weight) throws Exception
	{
		if(age>18 && weight>45)
			System.out.println("Eligible to donate the blood ");
		else
		{
			//to throw an exception explicitly
			throw new RuntimeException("Exception Caught");
		}
	}

	public static void main(String[] args) throws Exception
	{
		try
		{
			display(20,54);
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}

	}

}
