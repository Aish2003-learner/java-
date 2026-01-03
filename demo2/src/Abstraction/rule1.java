package Abstraction;

public class rule1 {
	public static void main(String[] args ) {
	     Bird s = new Bird() ;  // rule 1.can't instantiate a abstract class i.e can't create object bcz it is incomplete
	}
	}

	abstract class Bird {
		
		abstract void eat1();    
		void fly() {            
			System.out.println("Bird");
		}
	}
	
	
