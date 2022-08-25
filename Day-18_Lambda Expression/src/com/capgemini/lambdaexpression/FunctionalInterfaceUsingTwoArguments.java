package com.capgemini.lambdaexpression;
@FunctionalInterface
interface E 
{
	int add(int a,int b);//abstract method
}
public class FunctionalInterfaceUsingTwoArguments 
{
	public static void main(String[] args) 
	{
		//lambda expression with return statement
		/*E obj=(int a,int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(62,34));*/
		//lambda expression without return statement
		E obj=(int a,int b)->(a+b);
		System.out.println("Addition of a & b is "+obj.add(62,34));
	}
}
