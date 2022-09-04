package com.cg.framework;

public abstract class BankFactory 
{
	public abstract CurrentAcc getNewCurrentAcc(int accNo,String accNm,	float accBal,
			float creditLimit);
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,
			boolean isSalaried);
}
