package com.capgemini.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertionDemo 
{
	@Test
	public void print()
	{
		int result=9;
		int expected=9;
		/*s equal it will check the value is equal or not, if it is equal no failure otherwise
		 * you will get failure in testing*/
		assertEquals(result,expected);
	}
}
