package com.capgemini.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<Integer,String> s=new TreeMap<Integer,String>();
		s.put(51,"ok");
		s.put(32,"process");
		s.put(65,"continue");
		s.put(19,"static");
		s.put(46,"dynamic");
		System.out.println(s);
		System.out.println(s.firstEntry());
		System.out.println(s.lastEntry());
	}
}
