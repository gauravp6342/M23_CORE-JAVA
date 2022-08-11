package com.capgemini.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		float d=35.5f;
		Float e=d; //converting primitive to wrapper
		Float f=new Float(98.6);
		System.out.println(d+" "+e+" "+f);

	}

}
