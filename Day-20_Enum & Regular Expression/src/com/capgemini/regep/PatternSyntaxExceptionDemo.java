package com.capgemini.regep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionDemo 
{
	private static String REGEXP="[";
	private static String INPUT="I love Mumbai and Mumbai is famous for bollywod city";
	private static String REPLACE="Lonavala";
	public static void main(String[] args) 
	{
		try
		{
			Pattern p=Pattern.compile(REGEXP);
			Matcher m=p.matcher(INPUT);
			INPUT=m.replaceAll(REPLACE);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Description: "+e.getDescription());
			System.out.println("Description: "+e.getIndex());
		}
	}
}
