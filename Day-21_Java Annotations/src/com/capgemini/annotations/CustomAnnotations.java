package com.capgemini.annotations;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface MyCustom
{
	int accept();
}
class C
{
	@MyCustom(accept=68)
	public void display()
	{
		System.out.println("Hello, I am using Custom Annotations");
	}
}
public class CustomAnnotations 
{
	public static void main(String[] args) throws Exception
	{
		C c=new C();
		Method m=c.getClass().getMethod("display");
		MyCustom obj=m.getAnnotation(MyCustom.class);
		c.display();
		System.out.println(obj.accept());
	}
}
