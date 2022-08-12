package com.capgemini.array;

import java.util.Arrays;

public class UsingArrays {
	static void display(int...a)
	{
		//Arrays.sort defines Array is a class and sort is a method which sort the values
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		display(23,9,97,7,56,89,45);

	}

}
