package Abstraction;

public class abstrationrule2 {
	public static void main(String[] args ) {
	     //Bird s = new Bird() ; 
	}
	}

	abstract class Bird {
		
		abstract void eat();    //rule 2. abstract class may or may not have abstract method(),it is not compulsory
		void fly() {            // abstract shows incomplete status of the class i.e class may be added in future
			System.out.println("Bird");
		}
		abstract void jump(); 
	}

	