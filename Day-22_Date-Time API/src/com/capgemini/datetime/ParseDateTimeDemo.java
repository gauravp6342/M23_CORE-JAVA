package com.capgemini.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseDateTimeDemo 
{
	public static void main(String[] args) 
	{
		String datetime="2019-01-28 19:52";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
		LocalDateTime dt=LocalDateTime.parse(datetime,dtf);
		System.out.println(dt);
	}
}
