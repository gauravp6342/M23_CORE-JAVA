package com.capgemini.enums;
import java.util.Scanner;
//Example on enum with switch case
enum Movie
{
	//enums constants
	Dharmaveer,Pawankhind,Balkadu,Farzand,Tanhaji;
}
public class EnumWithSwitchCase 
{
	//enum variable
	Movie movie;
	//constructor for the "EnumWithSwitchCase"
	public EnumWithSwitchCase(Movie movie)
	{
		//as Enum var & constructor argument var is same"use this keyword"
		this.movie=movie;
	}
	//Using switch to display the songs name of the constants(m)
	public void display()
	{
		switch(movie)
		{
			case Dharmaveer:
				System.out.println("Anand Harpla and Gurupurnima");
				break;
			case Pawankhind:
				System.out.println("Raja Aala and Yugat Mandali");
				break;
			case Balkadu:
				System.out.println("Balkadu Powada");
				break;
			case Farzand:
				System.out.println("Aai Ambe Jagdambe and Shivaba Malhari");
				break;
			case Tanhaji:
				System.out.println("Maay Bhavani and Shankara Re Shankara");
				break;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie name that u want to display: ");
		String str=s.nextLine();
		//valueof():-to get the constant whose value is passed as an argument
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();
	}
}
