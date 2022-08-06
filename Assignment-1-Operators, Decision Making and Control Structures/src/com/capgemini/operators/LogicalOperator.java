package com.capgemini.operators;

import java.util.Scanner;

public class LogicalOperator 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res=(a<b && b>=19);
		boolean res1=(a>b || b<19);
		boolean res2=!(a>b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		s.close();
	
	}

}
