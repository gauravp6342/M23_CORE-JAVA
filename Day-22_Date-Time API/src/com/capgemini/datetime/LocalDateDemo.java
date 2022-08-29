package com.capgemini.datetime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo 
{
	public static void main(String[] args) 
	{
		LocalDate d=LocalDate.now();
		System.out.println(d);
		LocalDate da=LocalDate.of(2022,Month.FEBRUARY,28);
		System.out.println(da);
	}
}
