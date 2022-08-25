package com.capgemini.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void multiplication()
	{
		System.setProperty("Ajay","Ketan");
		//if assumption is true then printing statement will print otherwise not
		Assumptions.assumeTrue("Ketan".equals(System.getProperty("Ajay")));
		System.out.println("Assumption is true");
	}
	{
		System.setProperty("Subodh","Ketan");
		//if assumption is false then only printing statement will print otherwise not
		Assumptions.assumeFalse("Ketan".equals(System.getProperty("Ajay")));
		System.out.println("Assumption is false");
	}

}
