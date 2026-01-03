package Polymorphism;

public class rule2polyinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childb c =new Childb();
		c.disp5();

	}

	}

	class Parentb{
	 void disp5() {
		System.out.println("the parent class method");
	}
	}
	class Childb extends Parentb{
                  int  disp5() {  //return type of method of child class and corresponding method of parent class must me same
		System.out.println("the child is class method");
		return 0;
	}
	

}

