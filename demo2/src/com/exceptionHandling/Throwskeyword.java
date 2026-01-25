package com.exceptionHandling;

import java.util.Scanner;

public class Throwskeyword {
	public static void main(String[]args)
	{
		System.out.println("main connection established");
		test4 t4=new test4();
		try {
		t4.gamma4();
		}
		catch(Exception e)
		{
			System.out.println("Exception handle by main");

		}
		System.out.println("main connection terminated");

	}

}
class test4 
{
	
	void gamma4() throws Exception
	{
		System.out.println("test3 connection established");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 1 number");
		int a=sc.nextInt();
		System.out.println("enter the 2 number");
		
		int b= sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		
		System.out.println("test2 connection terminated");
	}

}
