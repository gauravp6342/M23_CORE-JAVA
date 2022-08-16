package com.capgemini.strings;

public class StringUsingStringLiteralandNewKeyword {

	public static void main(String[] args) {
		//Using String Literal
		//String str="Hello"; //it will only check if the srings are equal or not 
		//String str1="Hello";
		//System.out.println(str==str1);

		//Using New Keyword
		String str1=new String("Hello");//it will check the memory location
		String str2=new String("Hello");
		System.out.println(str1==str2);
		
		//Using Equals Method
		//System.out.println(str1.equals(str2));//it will only check the contents not the 
												//memory location
		
		//Another Example To Compare
		//String str1="Hello";
		//String str2="Hello";
		//String s1=new String("Hello");
		//String s2=new String("Hello");
		//System.out.println(str1==str2);
		//System.out.println(str2==s1);
		//System.out.println(s1==s2);
	}
}
