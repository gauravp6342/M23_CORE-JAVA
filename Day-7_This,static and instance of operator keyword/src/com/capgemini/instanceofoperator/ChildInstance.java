package com.capgemini.instanceofoperator;
class Y
{
	
}
public class ChildInstance extends Y {

	public static void main(String[] args) {
		ChildInstance c=new ChildInstance();
		//c is the object of parent class Y bcoz "ChildInstance" class accessing the "Y" class
		System.out.println(c instanceof Y);
		System.out.println(c instanceof ChildInstance);

	}

}
