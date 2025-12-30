package Inheritance;

public class inheritance_chaining {
	public static void main(String[] args) {
		Child9 C=new Child9();
		
		System.out.println(C.a+ " "+C.b);
		
	}

}
class Parent9 {
	int a;
	int b;
	public Parent9() {
		int a=10;
		int b=20;
		
	}
	public Parent9(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	
}

class Child9 extends Parent9{
	public Child9() {
		int a =30;
		int b =40;
		
	}
	public Child9(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	

	

}

