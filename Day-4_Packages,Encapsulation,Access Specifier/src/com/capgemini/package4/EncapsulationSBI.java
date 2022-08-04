package com.capgemini.package4;

import com.capgemini.package3.SBI;
//Program on Encapsulation
public class EncapsulationSBI {

	public static void main(String[] args) {
		SBI s=new SBI();
		
		s.setAmount(100000);//calling setters
		System.out.println("The amount in my bank is: "+s.getAmount());



	}

}
