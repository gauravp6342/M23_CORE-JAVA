package com.capgemini.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda 
{
	public static void main(String[] args) 
	{
		//lambda expression for searching the file in given path of particular extension
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".mp3");
		File dir=new File("D:\\Old PC\\RUTUJA\\Internal\\UCDownloads");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop
		/*if any particular extension file is open on your system then you will get that file
		 two times with one file with or will in $(Dollar) sign*/
		for(File i:contents)
		{
			System.out.println(i);
		}
	}
}
