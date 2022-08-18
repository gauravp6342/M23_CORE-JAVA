package com.capgemini.list;

import java.util.Vector;

public class VectorExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		v.add(17);
		v.add("Gaurav");
		v.add(2,'g');
		System.out.println(v);
	}

}
