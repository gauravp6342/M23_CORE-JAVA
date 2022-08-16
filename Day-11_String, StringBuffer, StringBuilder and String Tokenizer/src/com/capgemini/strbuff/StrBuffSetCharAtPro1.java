package com.capgemini.strbuff;

public class StrBuffSetCharAtPro1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Jeva");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1,'a');
		System.out.println(sb);
		System.out.println(sb.charAt(1));

	}

}
