package demo2;

import java.util.Scanner;

public class searchelement
{
	public static void main(String[] args)
	{
		int a[] = {10, 20, 30, 40, 50};
		System.out.println("enter the key ");
		Scanner sc = new Scanner(System.in);
		int key =sc.nextInt();
		boolean found =false;
		int idx=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				found=true;
				idx=i;
				break;
			}
		
		}
		if(found==true) {
			System.out.println("key is found at index "+ idx);
			
		}
		else
		{
			System.out.println("key is not found ");
			
		}
	}

}
