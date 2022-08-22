package com.capgemini.multithreading;

public class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Welcome To Multithreading Concept");
	}

	public static void main(String[] args) 
	{
		ThreadDemo t=new ThreadDemo();
		t.start();
		//1=Threading create=new Threading();
		//create.start();
		//create.run();
		//create.run();
	}
}
