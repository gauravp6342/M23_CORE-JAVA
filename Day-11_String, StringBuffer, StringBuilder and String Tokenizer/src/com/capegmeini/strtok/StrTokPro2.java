package com.capegmeini.strtok;

import java.util.StringTokenizer;

public class StrTokPro2 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Lets try this");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
