package com.exceptionHandling;

import java.util.Scanner;

public class testAp {
	
	public static void main(String[]args)
	{
		System.out.println("main connection established");
		test1 t1=new test1();
		t1.alpha();
		
		System.out.println("main connection terminated");

	}

}

class test1
{
	
	void alpha()
	{
		System.out.println("test1 connection established");
		test2 t2=new test2();
		t2.beta();
		System.out.println("t1 connection terminated");
	}
}
class test2
{
	
	void beta()
	{
		System.out.println("test2 connection established");
		test3 t3=new test3();
		t3.gamma();
		System.out.println("test2 connection terminated");
	}
}
class test3
{
	
	void gamma()
	{
		System.out.println("test3 connection established");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 1 number");
		int a=sc.nextInt();
		System.out.println("enter the 2 number");
		
		int b= sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception handled by gama");
		}
		System.out.println("test2 connection terminated");
	}
}