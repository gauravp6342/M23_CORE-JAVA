package com.capgemini.looping;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//20
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			s.close();
		}
	}

}
