package demo2;

import java.util.Scanner;

public class arrfloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no of student");
		int n= sc.nextInt();
		float a[]= new float[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("please enter your exact marks");
		    a[i] = sc.nextFloat();
			
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println("the exact marks of " + (j+1) + " student is " + a[j] );
		}
	}

}

	


