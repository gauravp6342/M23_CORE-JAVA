package com.capgemini.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLoggerDemo 
{
	/*
	@Test
	default void testMethod()
	{
		System.out.println("Test method");
	}*/
	
	/*It is used to signal that the annotated method should be executed before each tests in the 
	 current test class*/
	@BeforeEach
	default void beforeEachMethod()
	{
		System.out.println("Before each method");
	}
	
	/*It is used to signal that the annotated method should be executed after each tests in the 
	 current test class*/
	@AfterEach
	default void afterEachMethod()
	{
		System.out.println("After each method");
	}
}
