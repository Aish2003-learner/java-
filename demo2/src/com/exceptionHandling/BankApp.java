package com.exceptionHandling;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("main connection established");
		Bank b=new Bank();
		b.Banking();

	}

}

class Bank
{
	void Banking()
	{
		System.out.println("Bank connection established");
		ATM card=new ATM();
		try {
		card.transaction();
		
		}
		catch(Exception e)
		{
			System.out.println("your info is received by bank you money is refund in 24 hours");

		}
		System.out.println("Bank connection terminated");
		
	}
}
class ATM
{
	void transaction() throws Exception
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
		
		System.out.println("ATM connection terminated");
	}
}
