package com.capgemini.usesofthiskeyword;
//this can be passed as argument in the constructor call
class M
{
	public int num;
	M()
	{
		System.out.println("We Enjoyed The Trip");
	}
	M(int num)
	{
		this.num=num;
		
	}
}
public class InstanceConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		M m=new M();
		M s=new M(29);
		System.out.println(s.num);
	}

}
