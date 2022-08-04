package com.capgemini.oops;

class Hector
{ 
	//class var
	int speed;
	String color;
	//parameterized constructor
	Hector(int speed,String color)
	{
		this.speed=160;
	    this.color="Silver";	
	}
	void accept()
	{
		System.out.println("Speed is: "+speed+"km/hr" +" and color is: "+color);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Hector h=new Hector(160,"Silver");
		h.accept();
		

	}

}
