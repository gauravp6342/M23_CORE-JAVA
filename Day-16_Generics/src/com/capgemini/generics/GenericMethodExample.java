package com.capgemini.generics;

public class GenericMethodExample 
{
	//when we use generic method we can pass any types of arguments in the method
	public static <E>void printArray(E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		Integer[] arr1={16,23,52};
		Character[] arr2= {'h','v','q'};
		System.out.println("Printig array for Integer");
		printArray(arr1);
		System.out.println("Printig array for Character");
		printArray(arr2);
	}

}
