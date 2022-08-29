package com.capgemini.annotations;
class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is: "+s+"km/hr");
	}
}
class BMW extends Car
{
	//@Override annotations is giving the extra information about the method
	@Override
	public void speed(int s)
	{
		System.out.println("Speed is: "+s+"km/hr");
	}
}
public class OverRideAnnotations 
{
	public static void main(String[] args) 
	{
		BMW b=new BMW();
		b.speed(85);
	}
}


