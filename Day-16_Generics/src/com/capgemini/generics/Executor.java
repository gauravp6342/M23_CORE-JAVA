package com.capgemini.generics;

public class Executor {

	public static void main(String[] args) {
		//create a sender to send a message
		Sender<String>obj=new Sender<String>();
		obj.setMessage("Generic Class Demo");
		obj.sendMessage();
		System.out.println();
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("gauravpatil984@gmail.com");
		em.setTo("");
		em.setSubject("Java Full Stack");
		em.setBody("About Training & Placement");
		System.out.println(em.getBody());
		//create a sender to send this email
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		obj1.sendMessage();	
	}

}
