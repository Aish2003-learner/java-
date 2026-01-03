package com.exceptionHandling;

import java.util.Scanner;

public class example1 {
	public static void main(String []args) {
		System.out.println("connection estrablished");
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
			System.out.println("exception handled");
		}
		System.out.println("terminate");
		

}
}


