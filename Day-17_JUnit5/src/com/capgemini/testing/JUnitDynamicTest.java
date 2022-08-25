package com.capgemini.testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class JUnitDynamicTest 
{
	@TestFactory
	Collection<DynamicTest>display()
	{
		return Arrays.asList(dynamicTest("Simple Dynamic Test",()->assertTrue(true)),
				dynamicTest("My Executable Class",new MyExecutable()));
	}
}
class MyExecutable implements Executable
{
	public void execute()
	{
		System.out.println("Welcome To M23 Batch");
	}
}
