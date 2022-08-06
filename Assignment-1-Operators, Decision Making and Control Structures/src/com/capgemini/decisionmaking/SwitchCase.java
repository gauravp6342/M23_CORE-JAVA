package com.capgemini.decisionmaking;

import java.util.Scanner;

public class SwitchCase
{
	public static void main(String[] args) {
		//switch
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Motivational");
				break;
			case 2:
				System.out.println("Speech");
				break;
			case 3:
				System.out.println("By You");
				break;
			default:
				System.out.println("Wrong Words");
		}
		
		
	}
	
}



