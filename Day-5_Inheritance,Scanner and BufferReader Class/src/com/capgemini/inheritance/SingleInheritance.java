package com.capgemini.inheritance;
//Program on Single  Inheritance
class Parent
{
	protected int roll_no;
	void print()
	{
		System.out.println("Hey Guys! What's up");	
	}
	
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("Roll_no is "+roll_no);
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.roll_no=99;
		c.accept();
		c.print();
		
	}

}
