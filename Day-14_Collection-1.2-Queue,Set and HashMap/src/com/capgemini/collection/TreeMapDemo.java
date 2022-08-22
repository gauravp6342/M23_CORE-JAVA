package com.capgemini.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> a=new TreeMap<Integer,String>();
		a.put(3,"three");
		a.put(2,null);
		a.put(1,"one");
		a.put(4,"four");
		a.put(6,"six");
		a.put(5,"five");
		a.put(7,null);
		System.out.println(a);
	}

}
