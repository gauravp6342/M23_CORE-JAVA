package com.capgemini.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface Custom
{
	//abstract method
	/*if any custom annotation has/contains single method that particular annotation is known
	 as single-value annotation otherwise if it contains more than one method in the custom 
	 annotation then it is known as multi-value annotation*/
	String print() default "Gaurav";
	int
	speed() default 8;
	float percentage() default 9.8f;
}
class B
{
	@Custom (print="Welcome Friends",speed=80,percentage=95.7f)
	public void display()
	{
		System.out.println("Cheers!We won the match");
	}
}
public class CustomAnnotation 
{
	public static void main(String[] args) throws Exception
	{
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());
	}
}
