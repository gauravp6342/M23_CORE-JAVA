package com.capgemini.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo 
{
	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(8,27,52,8,64,97);
		Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);
		if(result.isPresent())
		{
			System.out.print("Result is: "+result.get());
		}
	}
}
