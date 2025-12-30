package Inheritance;

public class Rule4_inheritance {

	
	public static void main(String[] args) {
		Child4 c=new Child4();
		

	}

}
class Parent4 {
	public Parent4() {
		System.out.println("this is parent constructor");
	}
	class Parent5 {
		public Parent5() {
			System.out.println("this is parent constructor");
		}
		

	
	}


class Child4 extends Parent4 ,Parent5{//syntax error
	
	public Child4() {
		System.out.println("this is child constructor");
	}
	}


