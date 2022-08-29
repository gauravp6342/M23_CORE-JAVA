package com.capgemini.regep;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethodDemo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		//"//d" belongs to digit
		//String will split by digit
		String delimeter="\\d";
		//String delimeter="\n";
		//String delimeter="\t";
		Pattern p=Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
		String res[]=p.split(str);
		for(String i:res)
		{
			System.out.print(i+" ");
		}
		s.close();
	}
}
