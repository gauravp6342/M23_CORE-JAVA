package com.capgemini.lambdaexpression;
//to implement the runnable interface method
public class RunnableInterfaceImplementationUsingLambda 
{
	public static void main(String[] args) 
	{
		/*
		//Runnable Interface
		Runnable R1=new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable Interface Implementation");
			}
		};
		*/
		Runnable R1=()->
		{
			System.out.println("Runnable Interface Implementation");
		};
		Thread t=new Thread(R1);
		t.start();/*when we call start it will come into run method as discussed in lifecycle
		of thread*/
	}
}
