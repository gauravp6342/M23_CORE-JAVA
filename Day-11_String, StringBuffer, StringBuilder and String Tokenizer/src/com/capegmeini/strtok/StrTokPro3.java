package com.capegmeini.strtok;

import java.util.StringTokenizer;

public class StrTokPro3 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Let,s,try,this",",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
