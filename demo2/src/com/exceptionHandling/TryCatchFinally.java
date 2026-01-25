package com.exceptionHandling;

import java.util.Scanner;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		System.out.println("main connection established");
		Bank1 b=new Bank1();
		b.Banking1();

	}

}
	class Bank1
	{
		void Banking1()
		{
			System.out.println("Bank connection established");
			ATM1 card=new ATM1();
			try {
			card.transaction1();
			
			}
			catch(Exception e)
			{
				System.out.println("your info is received by bank you money is refund in 24 hours");

			}
			System.out.println("Bank connection terminated");
			
		}
	}
	class ATM1
	{
		void transaction1() throws Exception
		{
			System.out.println("ATM connection established");
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the 1 number");
			int a=sc.nextInt();
			System.out.println("enter the 2 number");
			
			int b= sc.nextInt();
			try
			{
			int c=a/b;
			System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("Exception handle by Atm ");
				throw e;
			}
			finally {
				System.out.println("ATM connection terminated");
			}
		}
	}



