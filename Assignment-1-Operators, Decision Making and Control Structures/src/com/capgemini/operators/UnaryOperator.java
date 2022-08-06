package com.capgemini.operators;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int x=a++; //5
		int y=++b; //6
		int z=x+a; //11
		int c=a--; //5
		int d=--b; //4
		int e=c-a; //1
		System.out.println(z);
		System.out.println(e);
		s.close();
	}

}
