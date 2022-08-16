package com.capgemini.strings;

import java.util.Scanner;

public class StringForComapringExampleUsing2Methods {

	public static void main(String[] args) {
		String str=new String("Dhoni");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str.equals(str1))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		s.close();
		
		/*String str=new String("Dhoni");
		String str1="Dhoni";
		String str2="Kohli";
		if(str.equals(str1));
		{
		System.out.println("Matching");
		}
		if(str.equals(str2));
		{
		System.out.println("Not Matching");
		}*/
		
	}

}
