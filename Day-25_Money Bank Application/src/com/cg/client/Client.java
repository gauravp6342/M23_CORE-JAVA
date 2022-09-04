package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client 
{
	public static void main(String[] args) 
	{
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(11032130,"Swaraj Jadhav",22500, true);
		CurrentAcc c=new MMCurrentAcc(11032135,"Swarup Patil",10900, 50);
		System.out.println("Saving Account: ");
		s.withdraw(500);
		System.out.println("Current Account: ");
		c.withdraw(500);
		System.out.println(s);
		System.out.println(c);
	}
}
