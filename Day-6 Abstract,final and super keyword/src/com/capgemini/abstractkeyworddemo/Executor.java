package com.capgemini.abstractkeyworddemo;

public class Executor {

	public static void main(String[] args) {
		//Creation of child class object as Gulabjamun is abstract we can't institate
		Sweet s=new Sweet();
		s.taste();
		s.print();
	}

}
