package com.capgemini.exceptionhandling;

//import java.util.Scanner;

public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter a string");
		String str=null;
		try
		{
			str.equals("JAVA");
		}
		catch(Exception e)
		{
			//allocated a new value to str as JAVA
			str=new String("JAVA");
			//str=new String("JAVA1");
			System.out.println(str.equals("JAVA"));
		}
		
	}

}
