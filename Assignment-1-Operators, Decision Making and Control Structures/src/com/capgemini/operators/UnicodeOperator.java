package com.capgemini.operators;

import java.util.Scanner;

public class UnicodeOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c='\u002F';
		System.out.println((int)c);
		s.close();
	}

}
