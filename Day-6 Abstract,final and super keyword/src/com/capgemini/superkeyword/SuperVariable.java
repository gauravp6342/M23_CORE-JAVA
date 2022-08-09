package com.capgemini.superkeyword;
class Color
{
	protected String name="White";
	
}
class Red extends Color
{
	public String name="Red";
	public void display()
	{
		System.out.println(name);
		//Super keyword is used to refer the parent class variable
		System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Red r=new Red();
		r.display();
		
	}

}
