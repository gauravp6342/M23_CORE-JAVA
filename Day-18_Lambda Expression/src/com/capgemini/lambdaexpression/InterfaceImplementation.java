package com.capgemini.lambdaexpression;
interface C
{
	/*lambda expression will only work for functional interface implementation not for 
	other interface*/
	//void accept();
	void display();
}
public class InterfaceImplementation 
{
	public static void main(String[] args) 
	{
		//The target type of this expression must be a functional interface
		C obj=()->
		{
			System.out.println("Functional Interface Implementation without lambda expression");
		};
		obj.display();
	}
}
