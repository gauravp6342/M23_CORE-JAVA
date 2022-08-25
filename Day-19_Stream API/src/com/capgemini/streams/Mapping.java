package com.capgemini.streams;

import java.util.Arrays;
import java.util.List;

public class Mapping 
{
	public static void main(String[] args) 
	{
		List<String>obj1=Arrays.asList(new String[] {"Mansi","Pratiksha","Tanvi","Janhavi","Jui"});
		//obj1.stream().filter(i->i.length()>4).forEach((i)->System.out.print(i+" "));
		//mapping example
		obj1.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));
	}
}
