package com.capgemini.usesofstatickeyword;

public class StaticBox 
{
	double width;
	double height;
	static int count;
	//parameterized constructor
	public StaticBox(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Count is: "+cnt);//1
		count=15;
		count++;
		System.out.println("Count is: "+count);
	}
	public static void main(String[] args) {
		StaticBox s=new StaticBox();
		s.width=40;
		s.height=8;
		System.out.println(s.width);

	}

}
