package com.capgemini.polymorphism;
//program on function overloading
class X
{
	//by having the different types of arguments
	void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	void mul(float x,float y)
	{
		System.out.println(x*y);
	}
	
}
public class CompileTime {

	public static void main(String[] args) {
		X obj=new X();
		obj.mul(6,9);
		obj.mul(5.0f,6.6f);

	}

}
