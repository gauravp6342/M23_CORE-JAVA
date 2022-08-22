package com.capgemini.generics;

public class GenericsClassExample<T>
{
	T num;
	//method
	public void show()
	{
		System.out.println(num.getClass().getName());
	}
	public static void main(String[] args) {
		// Instead of collections I have used Generic Class name & Genericx Concept
		GenericsClassExample<Double>obj=new GenericsClassExample<>();
		obj.num=24.8;
		obj.show();
	}

}
