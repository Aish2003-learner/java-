package encaptulation;
import java.util.Scanner;

//complete access 


/*public class Bankapp {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter amount to deposite");
		Bank b=new Bank();
		b.balance=sc.nextInt();
		System.out.println("your current balance :"+ b.balance);
		System.out.println("please enter amount to whithdraw");
		int w=sc.nextInt();
		b.balance=b.balance-w;
		System.out.println("your current balance :"+ b.balance);
		
		
		
	}
	

}
class Bank
{
	public int balance;
}*/


//no access

/*public class Bankapp {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter amount to deposite");
		Bank b=new Bank();
		b.balance=sc.nextInt();
		System.out.println("your current balance :"+ b.balance);
		System.out.println("please enter amount to whithdraw");
		int w=sc.nextInt();
		b.balance=b.balance-w;
		System.out.println("your current balance :"+ b.balance);
		
		
		
	}
	

}
class Bank
{
	private int balance;
}*/
 
//encaptulation concept (controlled access)

public class Bankapp {
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter amount to deposite");
		Bank b=new Bank();
		int bal=sc.nextInt();
		b.setBalance(bal);
		System.out.println("your current balance :"+ b.getBalance());
		System.out.println("please enter amount to whithdraw");
		int w=sc.nextInt();
		int upd_bal=b.getBalance()-w;
		b.setBalance(upd_bal);
		System.out.println("your current balance :"+ b.getBalance());
		
		
		
	}
	

}
class Bank
{
	private int balance;
	public void setBalance(int bal) //setter
	{
		if(bal>0)
		{
			balance=bal;
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	
	public int getBalance() //getter
	{
		return balance;
	}
}








