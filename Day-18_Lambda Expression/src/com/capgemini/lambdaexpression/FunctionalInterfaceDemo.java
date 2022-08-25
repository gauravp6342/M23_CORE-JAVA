package com.capgemini.lambdaexpression;
//functional interface
@FunctionalInterface
interface D
{
	String display(String str);//abstract method
}
public class FunctionalInterfaceDemo 
{
	public static void main(String[] args) 
	{
		//lambda expression with return statement
		D obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome To Lambda Expression Concept"));
	}
}
