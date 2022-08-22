package com.capgemini.multithreading;
class Practice1
{
	//mutual-exclusive using static synchronization
	public static synchronized void display()
	{
		System.out.println("Current thread " + Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " i - " + i);
			try 
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Valueof implements Runnable
{
	Thread t;
	Practice1 val;
	Valueof(Practice1 val)
	{
		this.val=val;
		t=new Thread(this);
		t.start();
	}
	@SuppressWarnings("static-access")
	public void run()
	{
			val.display();
	}
}
public class ThreadMutualExclusiveUsingSaticSynchronization
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Practice1 obj1=new Practice1();
		Practice1 obj2=new Practice1();
		Valueof t1=new Valueof(obj1);
		Valueof t2=new Valueof(obj2);
	}
}

