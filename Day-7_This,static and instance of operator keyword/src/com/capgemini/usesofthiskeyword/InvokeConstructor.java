package com.capgemini.usesofthiskeyword;
//this() : to invoke current class constructor
class Q
{
	public int x;
	//default constructor
	Q()
	{
		this(88);//invoking the parameterized constructor
		System.out.println("Default Constructor");
	}
	//parameterized constructor
	Q(int x)
	{
		System.out.println("Value is: "+x);
	}
}
public class InvokeConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Q obj=new Q();

	}

}
