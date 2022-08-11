package com.capgemini.polymorphism;
//program on method overriding
//one class is not enough to create two or more class which contains inheritance concept
class Addition
{
	void accept(int d,int e)
	{
		System.out.println(d+e);
	}
}
class Add extends Addition
{
	void accept(int u,int v)
	{
		System.out.println(u+v);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Add a=new Add();
		a.accept(16,8);
		Addition a1=new Addition();
		a1.accept(21,25);

	}

}
