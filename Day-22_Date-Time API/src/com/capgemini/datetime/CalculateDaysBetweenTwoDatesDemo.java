package com.capgemini.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDaysBetweenTwoDatesDemo 
{
	public static void main(String[] args) 
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plusDays(5);
		LocalDate date3=date1.minusDays(8);
		System.out.println(date2);
		System.out.println(date3);
		long db=ChronoUnit.DAYS.between(date1,date2);
		System.out.println(db);
	}
}
