package com.capgemini.testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo 
{
	//It will repeat the test for given set of time
	@RepeatedTest(8)
	void print()
	{
		System.out.println("Welcome To Imagica");
	}
}
