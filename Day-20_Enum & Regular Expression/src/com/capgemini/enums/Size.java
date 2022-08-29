package com.capgemini.enums;
//to demonstrate that Enum implements the interface
public enum Size implements PizzaSize 
{
	Small,Medium,Large,ExtraLarge;
	@Override
	public void size()
	{
		System.out.println("Size is: "+this);	
	}
}
