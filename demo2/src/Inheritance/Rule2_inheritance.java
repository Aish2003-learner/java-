package Inheritance;

public class Rule2_inheritance {
	public static void main(String[] args) {
		Child1 C=new Child1();
		System.out.println(C.a);
		System.out.println("------------------");
		C.disp();

	}

}
class Parent1 {
	int a=10;
	int b=20;
	private void disp() {
		System.out.println(a);
		System.out.println(a);
	}
}

class Child1 extends Parent1{


	

}
