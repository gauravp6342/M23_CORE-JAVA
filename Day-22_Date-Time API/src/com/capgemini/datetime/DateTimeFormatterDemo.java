package com.capgemini.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo 
{
	public static void main(String[] args) 
	{
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"); 
		String var=datetime.format(dtf);
		System.out.println(var);
	}
}
