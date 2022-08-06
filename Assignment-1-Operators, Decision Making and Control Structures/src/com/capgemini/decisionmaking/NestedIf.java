package com.capgemini.decisionmaking;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		//nested if
		if(age>=15)
		{
			if(weight>=55)
			{
				if(weight<=115)
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not Eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Not Eligible for bunjee jumping");
		}
		s.close();
	}
	
}