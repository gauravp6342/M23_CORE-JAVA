package com.capgemini.finalkeyword;
//Program on Final Variable
public class FinalVariable {
	final int FIN_VAR=45;
	/*public void print()
	 {
	 	//if any variable is declare as a final we can't change the value of that variable
	 	 
	 	 FIN_VAR=98;
	  }*/
	 
	public static void main(String[] args) {
		
		FinalVariable f=new FinalVariable();
		
		System.out.println(f.FIN_VAR);

	}

}
