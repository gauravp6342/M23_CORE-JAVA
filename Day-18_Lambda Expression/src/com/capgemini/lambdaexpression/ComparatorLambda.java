package com.capgemini.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambda 
{
	public static void main(String[] args) 
	{
	Comparator<String>obj=(m1,m2)->Integer.compare(m1.length(),m2.length());
	String str[]={"Ajay","Ketan","Kavya","Kaivalya","Ishan"};
	//here sort method will arrange the strings in terms of their lengths
	Collections.sort(Arrays.asList(str),obj);
	for(String i:str)
		System.out.print(i+" ");
	}
}
