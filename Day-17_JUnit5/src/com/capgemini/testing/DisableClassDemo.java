package com.capgemini.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
/*This class will be disabled when you run the code &your all the method output will not 
 * print as its disabled*/
public class DisableClassDemo 
{
	@Test
	void print()
	{
		System.out.println("Hello friends, i am using Disable annotation");
	}

}
