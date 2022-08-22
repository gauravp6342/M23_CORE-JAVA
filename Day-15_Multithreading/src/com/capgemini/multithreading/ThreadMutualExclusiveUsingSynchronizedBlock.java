package com.capgemini.multithreading;
class Practice2
{
	//mutual-exclusive using synchronized block
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1;i<6;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(650);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class Practice3 extends Thread
{
	Practice2 obj;
	Practice3(Practice2 obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.print(60);
	}
}
public class ThreadMutualExclusiveUsingSynchronizedBlock 
{

	public static void main(String[] args) 
	{
		Practice2 p=new Practice2();
		Practice3 t1=new Practice3(p);
		Practice3 t2=new Practice3(p);
		t1.start();
		t2.start();
	}
}
