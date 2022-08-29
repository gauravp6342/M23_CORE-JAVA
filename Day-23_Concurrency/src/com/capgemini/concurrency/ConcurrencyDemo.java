package com.capgemini.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo 
{
	public static void main(String[] args) throws ExecutionException 
	{
		//lambda expression for Runnable Interface(Functional Interface)
		Runnable r=()->
		{
			try
			{
				TimeUnit.MILLISECONDS.sleep(2300);
				System.out.println("Current Time: "+LocalDateTime.now());
		    }
		    catch(InterruptedException e)
			{
		    	System.out.println("Exception Handled");
			}
		 };
	
		//executors service instance
		ExecutorService obj=Executors.newFixedThreadPool(15);
		obj.execute(r);
		Future<String>res=obj.submit(r,"Done");
		//isDone()->if task is completed it returns true else false
		while(res.isDone()==false)
		{
			try
			{
				System.out.println("The method  returns value: "+res.get());
				break;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			try
			{
				Thread.sleep(1200);
			}
			catch(InterruptedException e)
			{
		    	e.printStackTrace();
			}
		 }
		obj.shutdown();
	}
}