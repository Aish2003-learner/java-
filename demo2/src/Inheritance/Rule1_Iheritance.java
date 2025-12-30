package Inheritance;

public class Rule1_Iheritance {

	public static void main(String[] args) {
		Child C=new Child();
		System.out.println(C.a);
		System.out.println("------------------");
		C.disp();

	}

}
class Parent {
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(a);
	}
}

class Child extends Parent{


	

}
