package com.capgemini.multithreading;
class Thread3 extends Thread
{
	//Interrupt method
	public void run()
	{
		//for(int i=1;i<=5;i++)
		System.out.println("Thread Interruption");
	}
}		
public class InterThreadDemo 
{
	public static void main(String[] args) 
	{
		Thread3 t3=new Thread3();
		t3.start();
		t3.interrupt();
	}
}
