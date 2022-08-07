package com.capgemini.recursion;

import java.util.Scanner;

public class Assignment2Question2SumOfDigitsUsingRecursion 
{

	   static int SumOfDigits(int num) 
	   {
	         if(num==0) 
	             return 0;  
	         else
	         return num % 10 + SumOfDigits(num/10);
	    }
	 
	    public static void main (String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter the no:");
	    	int num=s.nextInt();
	        int result=SumOfDigits(num);
	        System.out.println("The sum of digits is: "+result);
	        s.close();
	    	}
}
