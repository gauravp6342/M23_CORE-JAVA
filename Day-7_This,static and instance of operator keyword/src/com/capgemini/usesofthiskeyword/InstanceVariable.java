package com.capgemini.usesofthiskeyword;
//this keyword is used to refer the current class instance variable 
class W
{
	int s1,s2;
	public void print(int s1,int s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	public void display()
	{
		System.out.println("Multiplication of s1 and s2 is: "+(s1*s2));
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		W obj=new W();
		obj.print(31,15);
		obj.display();

	}

}
