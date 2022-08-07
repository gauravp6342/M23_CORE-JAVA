package com.capgemini.function;

import java.util.Scanner;

public class Factorial 
{
	//function definition
	static int factorial(int m)
	{
		int fact=1; 
		for(int i=1;i<=m;i++) 
		{
			fact=fact*i;
			
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		System.out.println(factorial(m));//fun call
		s.close();
	}

}
