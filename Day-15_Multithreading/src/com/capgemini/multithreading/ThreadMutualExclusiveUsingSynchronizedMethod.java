package com.capgemini.multithreading;
class Practice
{
	//synchronization-it means the capability to control the access of multiple threats
	//mutual-exclusive using synchronized method
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread
{
	Practice p;
	Thread1(Practice p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printTable(5);
	}	
}
class Thread2 extends Thread
{
	Practice p;
	Thread2(Practice p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printTable(100);
	}	
}
public class ThreadMutualExclusiveUsingSynchronizedMethod {

	public static void main(String[] args) 
	{
		Practice obj=new Practice();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}
}
