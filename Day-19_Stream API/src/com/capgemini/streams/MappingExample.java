package com.capgemini.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample 
{
	public static void main(String[] args) 
	{
		List<Integer>obj1=Arrays.asList(new Integer[] {30,6,4,9});
		obj1.stream().map((i->i*i)).forEach((i)->System.out.print(i+" "));
		System.out.println();
		
		//Stream class-Collectors just like a collection class//[]
		List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.print(obj2+" ");
	}
}
