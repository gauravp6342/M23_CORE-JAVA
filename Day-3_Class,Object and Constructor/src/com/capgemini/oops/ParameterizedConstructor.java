package com.capgemini.oops;

class Hector
{ 
	//class vAR
	int speed;
	String color;
	//parameterized constructor
	Hector(int speed,String color)
	{
		this.speed=155;
	    this.color="Blue";	
	}
	void accept()
	{
		System.out.println("Speed is: "+speed+"km/hr" +" and color is: "+color);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Hector h=new Hector(0, null);
		h.accept();
		

	}

}
