package com.capgemini.usesofstatickeyword;

public class StaticMethod {
	//static method: without creating the object we can call that method by making the given 
	//method name as static
	static void print()
	{
		System.out.println("Come on lets start Static Keyword concept");
	}
	public static void main(String[] args) {
		//StaticMethod s=new StaticMethod();
		//s.print();
		print();

	}

}
