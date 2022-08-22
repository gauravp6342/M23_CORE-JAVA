package com.capgemini.generics;
//demo on advantages of Generic Concept
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantagesExample {

	public static void main(String[] args) {
		List <Integer>obj=new LinkedList<>();
		obj.add(25);
		//1.Type Safety
		//obj.add("Gaurav");
		//obj.add(26.8f);
		System.out.println(obj);
		//2.Typecast is not required
		List<Integer>obj1=new ArrayList<>();
		obj1.add(42);
		//3.Compile Time checking
		//obj1.add(42)
		Integer d=obj1.get(0);
		System.out.println(obj1);
	}

}
