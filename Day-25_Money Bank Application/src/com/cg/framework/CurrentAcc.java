package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
{
		private final float creditLimit;
		//constructor
		public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit)
		{
			super(accNo,accNm,accBal);
			this.creditLimit =creditLimit;	
		}

		@Override
		public String toString() 
		{
			return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
		}
		public void withdraw(float withdraw)
		{
			if(withdraw>=creditLimit)
				
			{
				System.out.println("Your credit limit is "+creditLimit);
			}
			else
			{
				System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "
				+ ""+this.getAccNm() +" "+"Account Balance: "+this.getAccBal());
			}
		}
}
