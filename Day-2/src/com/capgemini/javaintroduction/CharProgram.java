package com.capgemini.javaintroduction;

import java.util.Scanner;

//package on character input
public class CharProgram {

	public static void main(String[] args) {
		//compile-time input
		//char x='a';
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		
		//run time input
		char x=s.next().charAt(0);
		System.out.println("The Character is : "+x);

	}

}
