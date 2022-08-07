package com.capgemini.recursion;

import java.util.Scanner;

public class Assignment2Question1FibonacciSeriesUsingRecursion
{
		static int Nth(int m)
		{
		    if(m==0)
		        return 0;
		    else if(m==1)
		        return 1;
		    else
		        return Nth(m-1)+Nth(m-2);
		}
		public static void main(String[] args) {
	            Scanner s=new Scanner(System.in);
			    System.out.print("Enter the N value:");
			    int m=s.nextInt();
			    System.out.print("Nth Fibonacci Number is: "+Nth(m));
		        s.close();
			}
	

}
