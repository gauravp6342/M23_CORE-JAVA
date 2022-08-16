package com.capgemini.strings;

import java.util.Scanner;

public class StringCharAtMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str.charAt(2));
		s.close();
	}

}
