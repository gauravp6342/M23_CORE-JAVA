package com.capgemini.inheritance;
//program on Hierarchical Inheritance
class ModelName
{
	void display1()
	{
		System.out.println("Model-Name");
	
	}
}
class TUV300 extends ModelName
{
	void print()
	{
		System.out.println("TUV300");
	
	}
}
class XUV500 extends ModelName
{
	void print1()
	{
		System.out.println("XUV700");
		
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		TUV300 t=new TUV300();
		XUV500 x=new XUV500();
		t.display1();
		t.print();
		x.print1();
		
	}

}
