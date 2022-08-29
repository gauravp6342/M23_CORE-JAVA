package com.capgemini.regep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassDemo 
{

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("and");
		Matcher m=p.matcher("He has good knowledge about cricket and he watches it regularly "
				+ "and also play");
		//it will check "and" location until last and it will print
		while(m.find())
		{
			System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
		}
	}
}
