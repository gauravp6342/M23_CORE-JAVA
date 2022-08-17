package com.capgemini.exceptionhandling;

class StaticException extends Exception
{
	private int detail;
	//parameterized constructor
	public StaticException(int detail) {
		super();
		this.detail=detail;
	}
	//non parameterized constructor
	public StaticException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return "StaticException [detail=" + detail + "]";
	}
}


public class UserExceptions 
{
	static void accept(int a)throws StaticException
	{
		System.out.println("called compute");
		if(a>10)
			throw new StaticException(a);
		System.out.println("No Exception");
	}

	public static void main(String[] args) 
	{
		try
		{
			accept(11);
		}
		catch(StaticException e)
		{
			System.out.println("Gaurav "+e);
		}
	}
	
}
