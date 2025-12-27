package demo2;

public class practice {
	

	    // JVM starts execution from this method
	    public static void main(String[] args) {
	        System.out.println("Main method with String[] args");
	        main(10);
	        main("Hello");
	    }

	    // Overloaded main method
	    public static void main(int a) {
	        System.out.println("Overloaded main with int: " + a);
	    }

	    // Overloaded main method
	    public static void main(String s) {	    	
	    	
	  
	        System.out.println("Overloaded main with String: " + s);
	    }
	}


