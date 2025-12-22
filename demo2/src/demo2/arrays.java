package demo2;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no of student");
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("please enter your marks");
		    a[i] = sc.nextInt();
			
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println("the marks of " + (j+1) + " student is " + a[j] );
		}
	}

}

