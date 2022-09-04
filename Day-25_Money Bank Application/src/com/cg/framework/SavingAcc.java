package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
		@SuppressWarnings("unused")
		static final private float MINBAL=0.0f;
		//constructor
		public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) 
		{
			super(accNo, accNm, accBal);
			this.isSalaried=isSalaried;
		}
		@Override
		public String toString() {
			return String.format("SavingAcc [isSalaried=%s]", isSalaried);
		}
		public void withdraw(float withdraw)
		{
			if(accBal<MINBAL)
			{
				System.out.println("Account Balance Minimum Limit "+MINBAL);
			}
			else
			{
				System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "
				+ ""+this.getAccNm() +" "+"Account Balance: "+this.getAccBal());
			}
		}
}
