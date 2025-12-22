package demo2;

import java.util.Scanner;

public class jacked2d {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/*int a[][]= new int [3][];
		a[0]= new int [4];
		a[1]= new int [2];
		a[2]= new int [3];*/
		
		//taking input of number of class
	
		System.out.println("enter the number of class ");
		int n = sc.nextInt();
		int  a[][] = new int[n][];
		
		//taking input as number of student in each class
		 for (int d = 0; d < n; d++) {
	            System.out.print("Enter number of student of a class  " + (d + 1) + ": ");
	            int cols = sc.nextInt();
	            a[d] = new int[cols];
		 }
		
		
		
		
		//taking input as each marks of student
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter the marks of class  " + (i+1) +  " student " + (j+1) );
				a[i][j]=sc.nextInt();
			}
		}
		
		//output array
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



	