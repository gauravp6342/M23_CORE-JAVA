package com.capgemini.multithreading;
class Seller
{
	int value=10000;
	synchronized void cost(int Value)
	{
		System.out.println("Spend value");
		if(this.value<value)
		{
			System.out.println("Less value");
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
		this.value=this.value-value;
		System.out.println("process completed...");
	}
	synchronized void paid(int value)
	{
		System.out.println("get value");
		this.value=this.value+value;
		System.out.println("completed");
	}
}
public class InterThreadWait {
	public static void main(String[] args) {
		Seller c=new Seller();
		new Thread()
		{
			public void run()
			{
				c.cost(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.paid(10000);
			}
		}.start();
	}
}




