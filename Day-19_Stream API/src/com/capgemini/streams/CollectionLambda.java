package com.capgemini.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda 
{
	public static void main(String[] args) 
	{
		Set<Integer> obj=new HashSet<>();
		obj.add(88);
		obj.add(57);
		obj.add(90);
		obj.add(32);
		System.out.println(obj);
		/*if you want to extract this set value we can go ahead with Iterator,while loop,
		 for loop but using stream API-forEach() method we can do it in a one line*/
		//extracting the values from set
		obj.forEach(System.out::println);
	}
}
