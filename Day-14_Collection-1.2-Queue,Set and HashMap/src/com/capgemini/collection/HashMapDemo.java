package com.capgemini.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{	
		Map<Integer,String> a=new HashMap<Integer,String>();
		a.put(51,"Ajay");
		a.put(32,null);
		a.put(null,null);
		a.put(25,"Ishan");
		a.put(47,"KP");
		a.put(60,"Gaurav");
		a.remove(32);
		System.out.println(a);
	}
}
