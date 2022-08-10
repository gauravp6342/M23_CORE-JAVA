package com.capgemini.thisdemo;

public class Executor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Base2orDerived b=new Base2orDerived();//default constructor
		@SuppressWarnings("unused")
		Base2orDerived b1=new Base2orDerived(59);//parameterized constructor

	}

}
