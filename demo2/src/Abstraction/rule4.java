package Abstraction;

public class rule4 {

	public static void main(String[] args ) {
	     duty(new VegSparrow());
	     duty(new NonVegSparrow());
	}
		
		static void duty(Bird b) {
			b.eat();
			b.fly();
		}
	}

	//rule 4. if a child class only partially implement parent abstract class then it must be itself declared as abstract 

	abstract class Bird {
		
		abstract void eat();    
		abstract void fly(); 
	}

	abstract class Sparrow extends Bird{   
		void eat() {
			System.out.println("Bird is eating");
		}
	}

	class VegSparrow extends Sparrow{
		void eat() {
			System.out.println("VegSparrow eat grain");
		}
		void fly() {
			System.out.println("VegSparrow is flying");
		}
	}

	class NonVegSparrow extends Sparrow{
		void eat() {
			System.out.println("NonVegSparrow eat worm");
		}
		void fly() {
			System.out.println("NonVegSparrow is flying");
		}
	}
