package com.capgemini.array;

import java.util.Scanner;

public class ArrayDemoUserInputEnhancedForLoop {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size=s.nextInt();
			//array decalartion
			int arr[]=new int[size];
			System.out.println("Enter the values: ");
			//to enter the elements in the array
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter the "+i+" index");
				arr[i]=s.nextInt();
			}
			//enhanced for loop
			for(int j:arr)
			{
				System.out.println(j);
			}	
		}
	}
