package com.capgemini.usesofthiskeyword;
//this can be passed as an argument in the method call
class B
{
	public void follow(B b)
	{
		System.out.println("Follow Method");
	}
	public void follow1()
	{
		follow(this);
	}
}

public class InstanceorArgumentForMethodCall {

	public static void main(String[] args) {
		B b=new B();
		b.follow(b);
	}

}
