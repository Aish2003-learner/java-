package Inheritance;

public class rule5 {
	

		public static void main(String[] args) {
			Child6 C= new Child6();
			System.out.println(C.a);
			System.out.println(C.b);
			

		}

	}
	class Grandparent
	{
		int b=20;
	}
	class Parent7 extends Grandparent {
		int a=10;
		}

	class Child6 extends Parent7{


		

	}


