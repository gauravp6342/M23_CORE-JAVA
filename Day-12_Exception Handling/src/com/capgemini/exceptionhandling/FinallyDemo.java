package com.capgemini.exceptionhandling;

public class FinallyDemo {
	
	public static void print(int[] arr) {
		//System.out.println(arr[3]);
		System.out.println(arr[2]);
		System.out.println("Fourth element successfully displayed!");
	}

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		try
		{
			int[] myIntArray=new int[] {1,2,3};
			print(myIntArray);
			//final block will not be executed because of below line
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//if any statement is out of the try/catch block that will alaways be executed
		/*finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Third Line");*/
		finally
		{
			System.out.println("Finally block is always executed");
		}
		System.out.println("Third Line");
	}

}
