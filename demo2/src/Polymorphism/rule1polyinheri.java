package Polymorphism;

public class rule1polyinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childb c =new Childb();
		c.disp5();

	}

	}

	class Parentb{
	protected void disp5() {
		System.out.println("the parent class method");
	}
	}
	class Childb extends Parentb{
	public void disp5() {
		System.out.println("the child is class method");
	}
	

}
