package com.capgemini.strings;

import java.util.Scanner;

public class StringUsingStringLiteral {

	public static void main(java.lang.String[] args) {
		//Compile Time Input
		//String str="Kaivalya Patil";
		//System.out.println(str);
		
		//User Input
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println(str1);
		s.close();
	}

}
