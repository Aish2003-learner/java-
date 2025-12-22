package demo2;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of class");
		int n=sc.nextInt();
		System.out.println(" enter no of student ");
		int nn = sc.nextInt();
		int a[][]=new int [n][nn];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter the marks of class  " + (i+1) +  " student " + (j+1) );
				a[i][j]=sc.nextInt();
			}
		}
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y < a[x].length;y++)
			{
				System.out.print(a[x][y] + "  ");
			}
			System.out.println("\n");
		}	
		
	}

}
