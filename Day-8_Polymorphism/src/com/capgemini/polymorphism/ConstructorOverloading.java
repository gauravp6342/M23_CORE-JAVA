package com.capgemini.polymorphism;
//program on constructor overloading
class Hector
{
	int speed;
	String engine;
	//zero parameter
	Hector()
	{
		System.out.println("MG-Astor");
	}
	//two parameter
	Hector(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: "+speed+"km/hr" +" and the engine is on:"+engine);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Hector h=new Hector();
		Hector h1=new Hector(80,"Diesel");
	}

}
