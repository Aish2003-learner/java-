package Polymorphism;

public class Fullpolymorphism {
	public static void main(String[] args) {

        
       duty(new JavaTrainer2());
        duty(new AptiTrainer2());
        duty(new TestingTrainer2());
    }
	static void duty(Trainer2 t)
	{
		t.teach();
	}
}

class Trainer2 {
    void teach() {
        System.out.println("Job is teaching");
    }
}

class JavaTrainer2 extends Trainer2{
  
    void teach() {
        System.out.println("Job is teaching Java");
    }
}

class AptiTrainer2 extends Trainer2 {
    
    void teach() {
        System.out.println("Job is teaching Aptitude");
    }
}

class TestingTrainer2 extends Trainer2 {
    
    void teach() {
        System.out.println("Job is teaching Testing");
    }
}

