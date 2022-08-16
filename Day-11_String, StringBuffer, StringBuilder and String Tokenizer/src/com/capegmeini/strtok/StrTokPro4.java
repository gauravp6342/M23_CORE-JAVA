package com.capegmeini.strtok;

import java.util.StringTokenizer;

public class StrTokPro4 {

	public static void main(String[] args) {
		StringTokenizer st3=new StringTokenizer("JAVA:Code:String", ":", true);
		while(st3.hasMoreTokens())
		{
			System.out.println(st3.nextToken());
		}
	}

}
