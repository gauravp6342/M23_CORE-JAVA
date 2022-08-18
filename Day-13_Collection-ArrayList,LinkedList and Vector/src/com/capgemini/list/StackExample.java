package com.capgemini.list;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(0,"Gaurav");
		obj.add(0,'m');
		obj.add(0,15.6f);
		System.out.println(obj);
		//to insert the element
		obj.push(35);
		System.out.println(obj);
		//to remove the element
		obj.pop();
		System.out.println(obj);
	}

}
