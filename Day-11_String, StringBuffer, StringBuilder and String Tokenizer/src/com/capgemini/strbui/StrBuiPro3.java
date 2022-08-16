package com.capgemini.strbui;

public class StrBuiPro3 {

	public static void main(String[] args) {
		String s="Tomorrow";
		StringBuilder sb=new StringBuilder(s.length());
		System.out.println(sb.capacity());
	}

}
