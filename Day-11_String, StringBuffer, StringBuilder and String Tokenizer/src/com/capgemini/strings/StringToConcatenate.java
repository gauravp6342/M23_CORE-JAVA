package com.capgemini.strings;

import java.util.Scanner;

public class StringToConcatenate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		System.out.println("Good"+"Morning");
		System.out.println("Good"+"Morning"+15+28);
		System.out.println(15+28+"Good"+"Morning"+15+28);
		System.out.println(str.concat(str1));
		s.close();
		
		/*String s="Apple";
		String r=null;
		System.out.println(s+r);
		System.out.println(s.concat(r));*/
		
	}
}
