package com.capgemini.multithreading;
class Thread5 extends Thread{
	//Interrupted Method
		public void run()
		{
			for(int i=1;i<=7;i++)
			{
				System.out.println("watching sports "+i);
			}
		}
	}
	public class InterThreadPractice 
	{
		@SuppressWarnings("static-access")
		public static void main(String[] args) throws ArithmeticException
		{
			Thread5 t5=new Thread5();
			t5.start();
			System.out.println("thread interrupted "+t5.interrupted());
			t5.interrupt();
			System.out.println("thread interrupted "+t5.interrupted());
		}
	}


