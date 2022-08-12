package com.capgemini.array;
class Student
{
	public int roll_no;
	public String name;
	//constructor
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;

	}
}
public class StudentArray {

	public static void main(String[] args) {
		//Non Primitive Array Memory Allocation
		Student[] arr=new Student[4];
		arr[0]=new Student(206,"Gaurav");
		arr[1]=new Student(207,"Jitesh");
		arr[2]=new Student(208,"Abhishek");
		arr[3]=new Student(209,"Tirth");
		for(int i=0;i<arr.length;i++)
		{
				System.out.println("Element at " +i+" index: "+arr[i].roll_no+" "+arr[i].name);
		}
	}

}
