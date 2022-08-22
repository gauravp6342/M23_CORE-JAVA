package com.capgemini.multithreading;
public class InterThreadNotifyAll
{
	class Note1 extends Thread
	{
		public void run()
		{
			synchronized(this)
			{
				System.out.println("Starting of " +Thread.currentThread().getName());
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +"...notified");
			}
		}
	}
	class Note2 extends Thread {
		Note1 t1;
		Note2(Note1 t1) 
		{
			this.t1 = t1;
		}
		public void run() {
			synchronized(this.t1){
				System.out.println("Starting of " +Thread.currentThread().getName());
				try
				{
					this.t1.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +"...notified");
			}
	}
	}
	class Note3 extends Thread
	{
		Note1 t1;
		Note3(Note1 t1)
		{
			this.t1 = t1;
		}
		public void run()
		{
			synchronized(this.t1)
			{
				System.out.println("Starting of " +Thread.currentThread().getName());
				// call the notifyAll() method
				this.t1.notifyAll();
				System.out.println(Thread.currentThread().getName() +"...notified");
			}
		}
	}
}