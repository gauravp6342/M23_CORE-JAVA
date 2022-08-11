package com.capgemini.polymorphism;
//program on function overloading
//program on method overloading
class Shape
{
	//by changing the no of arguments
	int area(int x)
	{
		return x*x;
	}
	int area(int x,int y)
	{
		return x*y;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println(s.area(9));
		System.out.println(s.area(20,22));
	}

}
