package com.capgemini.superkeyword;
class A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is: "+pin);
	}
}
class B extends A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is: "+pin);
	}
	public void print()
	{
		display(9511);//child class
		super.display(5646);//parent class method
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();

	}

}
