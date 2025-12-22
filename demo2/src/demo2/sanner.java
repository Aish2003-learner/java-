package demo2;
import java.util.Scanner;

public class sanner {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter you name");
		String name = sc.next();
		System.out.println(name);
		System.out.println("please enter you age");
		int age  = sc.nextInt();
		System.out.println(age);
		System.out.println("please enter you gender");
		String gender = sc.next();
		System.out.println(gender);
		System.out.println("please enter you mob_no");
		String mob_no = sc.next();
		System.out.println(mob_no);
		System.out.println("please enter you college_id");
		int  college_id = sc.nextInt();
		System.out.println(college_id);
		System.out.println("please enter you adhar");
		int adhar = sc.nextInt();
		System.out.println(adhar);
		System.out.println("please enter you email");
		String email = sc.next();
		System.out.println(email);
		System.out.println("please enter you status");
		String status = sc.next();
		System.out.println(status);
	}
}
