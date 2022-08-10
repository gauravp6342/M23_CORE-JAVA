package com.capgemini.usesofthiskeyword;
class Mobile
{
	public int m,t;
	//default constructor
	Mobile()
	{
		m=92;
		t=75;
	}
	Mobile get()
	{
		//this keyword is used to return current class instance variable
		return this;
	}
	public void display()
	{
		System.out.println("Subtraction of m and t is: "+(m-t));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.get().display();
		}

}
