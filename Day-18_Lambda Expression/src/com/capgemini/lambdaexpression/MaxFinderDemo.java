package com.capgemini.lambdaexpression;

public class MaxFinderDemo 
{
	public static void main(String[] args) 
	{
		MaxFinder obj=(a,b)->a>b?a:b;
		//int res=obj.maximum(0,0);
		System.out.println("The Greatest Value is: "+obj.maximum(45,76));
	}
}
