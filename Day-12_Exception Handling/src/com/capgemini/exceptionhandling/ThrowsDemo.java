package com.capgemini.exceptionhandling;

public class ThrowsDemo
{
	//throws is used to declare an exception
	static void print(int num)throws RuntimeException,ClassNotFoundException
	{
		if(num==1)
			throw new RuntimeException("Exception Caught");
		else
			throw new ClassNotFoundException("Exception Caught");
	}

	public static void main(String[] args) throws RuntimeException {
		try
		{
			print(2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
