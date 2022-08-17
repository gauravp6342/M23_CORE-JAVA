package com.capgemini.exceptionhandling;

import java.util.Scanner;

public class ArithException1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int res=0;
		//try block contains exception and non-exception code
		//handling the exception using catch block
		
		try
		{
			int m=24;
			System.out.println("Enter the value of n:");
			int n=s.nextInt();
			res=m/n;
			System.out.println(res);
		}
		//Exception is a predefined class in java which you will get the Exception name 
		catch(Exception e)
		{
			System.out.println("Exception Handled:" +e);
		}
		s.close();
	}

}
