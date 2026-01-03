package Polymorphism;

public class method_overriiding {

	public static void main(String[] args) 
	{
	      parent p=new parent();
	      p.disp();
	      child c=new child();
	      c.disp();
	      parent p1=new child();
	      p1.disp();
	      

	}

}
class parent
{
	  void disp()
	{
		System.out.println("this is parent method");
	}
}
class child extends parent
{
	 void disp()
	{
		System.out.println("this is child method");
	}
}