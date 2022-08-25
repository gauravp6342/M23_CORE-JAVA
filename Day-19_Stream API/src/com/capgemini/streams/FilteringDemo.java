package com.capgemini.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo 
{
	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(8,27,52,8,64,97);
		//filter (predicate) method
		obj.stream().filter(i->i>49).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The distinct elements are ");
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The limit is: ");
		obj.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The discarded element is: ");
		obj.stream().limit(3).forEach((i)->System.out.print(i+" "));
	}
}
