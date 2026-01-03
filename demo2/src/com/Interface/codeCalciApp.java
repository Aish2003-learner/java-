package com.Interface;
import java.util.Scanner;

public class codeCalciApp {
	
	public static void main(String[]args)
	{
	    
		duty(new RupeshSoft());
		duty(new YashInfotech());
		
		
	}
	
	
	static void duty(codeCalci s)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the operator");
		char operator =sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':
			s.add();
			break;
			
		case '-':
			s.sub();
			break;
			
			
		case '*':
			s.multi();
			break;
			
		case '/':
			s.divi();
			break;		
		}
	
	}
	

}
class RupeshSoft implements codeCalci
{

	
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition is" + c);
		
		
	}

	
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("substration is" + c);
		
		
	}

	
	public void multi() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("multiplication is" + c);
		
		
		
	}

	
	public void divi() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println("division is" + c);
		
		
		
	}
	
}

class YashInfotech implements codeCalci
{
	Scanner sc= new Scanner(System.in);

	
	public void add() {
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		char sign=sc.next().charAt(0);
		int c=a+b;
		System.out.println("addition is" + c);
	}
	
	public void sub() {
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("substration is" + c);
		
	}

	
	public void multi() {
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("multiplication is" + c);
		
	}

	
	public void divi() {
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("division is" + c);
		
	}
	
}
