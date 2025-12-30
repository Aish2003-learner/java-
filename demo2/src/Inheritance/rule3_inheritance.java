package Inheritance;

public class rule3_inheritance {

	
		public static void main(String[] args) {
			Child2 c=new Child2();
			

		}

	}
	class Parent2 {
		public Parent2() {
			System.out.println("this is parent constructor");
		}
		
		
		}
	

	class Child2 extends Parent2{
		public Child2() {
			System.out.println("this is child constructor");
		}
		


	}


