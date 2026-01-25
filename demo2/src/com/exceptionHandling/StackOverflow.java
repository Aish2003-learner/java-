package com.exceptionHandling;

public class StackOverflow {
	public static void main(String[] args) {
		disp();
		}
	static void disp()
	{
		System.out.println("HELLO");
		//disp();      //stack overflow
		try {
		disp();
		}
		catch(Error e)
		{
			System.out.println("Error handle");           //handled
		}
	}
}
