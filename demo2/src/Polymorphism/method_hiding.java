package Polymorphism;

public class method_hiding {
	

		public static void main(String[] args) 
		{
		      parent1 p=new parent1();
		      p.disp();
		      child1 c=new child1();
		      c.disp();
		      parent1 p1=new child1();
		      p1.disp();
		      

		}

	}
	class parent1
	{
		 static  void disp()
		{
			System.out.println("this is parent method");
		}
	}
	class child1 extends parent1
	{
		 static void disp()
		{
			System.out.println("this is child method");
		}
	}

