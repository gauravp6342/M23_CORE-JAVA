package com.capgemini.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample 
{

	public static void main(String[] args) 
	{
		List<String>obj1=Arrays.asList(new String[] {"Mansi","Pratiksha","Tanvi","Janhavi","Jui"});
		//to return the length of the string whose length  if greater than 4
		obj1.stream().filter(i->i.length()>4).forEach((i)->System.out.print(i+" "));
	}
}
