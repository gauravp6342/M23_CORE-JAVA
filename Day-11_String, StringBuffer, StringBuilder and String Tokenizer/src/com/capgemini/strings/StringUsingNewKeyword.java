package com.capgemini.strings;

import java.util.Scanner;

public class StringUsingNewKeyword {

	public static void main(String[] args) {
		//User Input
		Scanner s=new Scanner(System.in);
		String str=new String(s.nextLine());
		System.out.println(str);
		s.close();
		
		//Compile Time Input
		//String str=new String("Welcome To The Program");
		//System.out.println(str);

	}

}
