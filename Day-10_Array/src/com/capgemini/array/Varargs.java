package com.capgemini.array;

public class Varargs 
{
	//variable argument ...(ellipse)=>
	static void display(int d,int e,String... s)
	{
		System.out.println(d+","+e);
	//To Print VarArgs
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}
	public static void main(String[] args) 
	{
		//function call
		display(52,22,"Python","Java","c++");
	}

}
