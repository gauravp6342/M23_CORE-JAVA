package com.capgemini.recursion;

import java.util.Scanner;

public class FactorialUsingRecusrsion 
{

		//function definition
		static int factorial(int m)
		
		{
			if(m==1)
				return 1;
			else
				return m*factorial(m-1);
		}
			
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int m=s.nextInt();
			System.out.println(factorial(m));//fun call
			s.close();
		}

	}





	