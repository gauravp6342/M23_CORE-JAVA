package com.capgemini.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo 
{
	public static void main(String[] args) 
	{
		//Stream can be created with static data
		Stream<String>obj=Stream.of("Pratiksha","Tanvi","Mansi","Manthan");
		//Terminal Operation-forEach()
		obj.forEach((i)->System.out.print(i+"  "));
		System.out.println();
		
		//Stream can be acquired from array or collection
		List<String>obj1=Arrays.asList(new String[] {"53","75","65","89"});
		obj=obj1.stream();
		obj.forEach(System.out::println);
		
	}
}
