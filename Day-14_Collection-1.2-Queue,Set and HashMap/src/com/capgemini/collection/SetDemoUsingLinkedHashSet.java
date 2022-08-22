package com.capgemini.collection;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemoUsingLinkedHashSet {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add(37);
		s.add(null);
		//set removes the duplicate i.e it prints the value only once
		s.add(37);
		System.out.println(s);
	}
}
