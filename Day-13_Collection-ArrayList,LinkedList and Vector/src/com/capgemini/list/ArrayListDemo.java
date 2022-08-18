package com.capgemini.list;

//import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<Integer>obj=new ArrayList<Integer>();
		LinkedList<Integer>obj=new LinkedList<Integer>();
		obj.add(18);
		obj.add(29);
		System.out.println(obj);
		System.out.println(obj.contains(6));
		System.out.println(obj.get(1));
		obj.set(0,14);
		System.out.println(obj);
		//copying one list into another
		Object run;
		run=obj.clone();
		System.out.println(run);
		obj.addFirst(15);
		obj.addLast(32);
		System.out.println(obj);
	}

}
