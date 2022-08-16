package com.capgemini.strings;

import java.util.Scanner;

public class StringToUpperCaseMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str.toUpperCase());
		s.close();
	}

}
