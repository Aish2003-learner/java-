package com.exceptionHandling;

import java.util.Scanner;

public class example2 {
	public static void main(String []args)
	{
		try{
		
			System.out.println("connection estrablished");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 1 number");
		int a=sc.nextInt();
		System.out.println("enter the 2 number");
		
		int b= sc.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("please enter size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("plz enter index number");
		int n= sc.nextInt();
		arr[n]=999;
		}
	/*	catch(Exception e)                           //catch block execute in  sequence if we put parent exception in the 
	                                                  the top (Exception e) other child exception classes does not execute hence 
	                                                  if any exception occur it solved by parent catch block only
		{
			System.out.println("exception handled");
		}*/
		catch(ArithmeticException e)
		{
			//e.printStackTrace(); //will give the exact line and detail of exception occur
			System.out.println("divide by zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace(); //will give the exact line and detail of exception occur
			System.out.println("please define the index within a range");
		}
		catch(NegativeArraySizeException e)
		{
			//e.printStackTrace(); //will give the exact line and detail of exception occur
			System.out.println("please enter positive size of array");
		}
		
		
		
		System.out.println("terminate");
  }

}
