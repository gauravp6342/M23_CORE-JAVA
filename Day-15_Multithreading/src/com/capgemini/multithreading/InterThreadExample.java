package com.capgemini.multithreading;
class Thread4 extends Thread
{
	//isInterrputed Method
	public void run()
	{
		for(int i=1;i<=7;i++)
		{
			System.out.println("playing cricket "+i);
		}
	}
}
public class InterThreadExample
{
	public static void main(String args[])throws InterruptedException
	{
		Thread4 t4=new Thread4();
		t4.start();
		System.out.println("is thread interrupted "+t4.isInterrupted());
		t4.interrupt();
		System.out.println("is thread interrupted "+t4.isInterrupted());
	}
}
