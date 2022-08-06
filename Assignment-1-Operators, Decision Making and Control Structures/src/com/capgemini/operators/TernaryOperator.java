package com.capgemini.operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int res=(a%b==0)? a:b;
		System.out.println(res);
		s.close();
	}

}
