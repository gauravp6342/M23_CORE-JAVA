package com.capgemini.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger 
{
	/*It is used to signal that the annotated method should be executed before all tests in the 
	 current test class*/
	@BeforeAll
	//default method
	default void beforeAllTest()
	{
		System.out.println("Before all test");
	}
	
	/*It is used to signal that the annotated method should be executed after all tests in the 
	 current test class*/
	@AfterAll
	default void afterAllMethod()
	{
		System.out.println("After all method");
	}
}
