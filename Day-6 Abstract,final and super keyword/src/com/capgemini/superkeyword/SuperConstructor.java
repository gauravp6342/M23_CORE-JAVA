package com.capgemini.superkeyword;
class Android
{
	
	Android()
	{
		System.out.println("Samsung is Android Mobile");
	}
}
class Samsung extends Android
{

	Samsung()
	{
		//Android(super) class constructor
		super();
		System.out.println("Goodbye Friends");
	}
}
public class SuperConstructor {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Samsung s=new Samsung();
	
	}

}
