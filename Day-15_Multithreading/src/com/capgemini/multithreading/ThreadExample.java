package com.capgemini.multithreading;
class Test extends Thread
{
	public void run()
	{
		System.out.println("Threading Concept");
	}
}
public class ThreadExample
{
	public static void main(String args[]) 
	{
		Test create=new Test();
		create.start();
		create.start();
	}
}