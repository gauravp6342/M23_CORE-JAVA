package com.capgemini.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneIdDemo 
{
	public static void main(String[] args) 
	{
		LocalTime t=LocalTime.now(ZoneId.of("Jamaica"));
		//LocalTime t=LocalTime.now(ZoneId.of("America/Los_Angeles"));
		LocalDateTime dt=LocalDateTime.now(ZoneId.of("Jamaica"));
		System.out.println(t);
		System.out.println(dt);
		for(String str:ZoneId.getAvailableZoneIds())
		{
			System.out.println(str);
		}
	}
}
