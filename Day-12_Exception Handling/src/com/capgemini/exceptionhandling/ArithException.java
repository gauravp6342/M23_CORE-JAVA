package com.capgemini.exceptionhandling;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=25;
		int n=s.nextInt();
		int res=m/n;
		s.close();
		System.out.println(res);
	}

}
