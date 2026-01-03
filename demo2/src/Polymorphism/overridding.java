package Polymorphism;
// polymorphic version
public class overridding {
	public static void main(String[] args) {

        Trainer1 a;
        a = new JavaTrainer1();
        a.teach();

        a = new AptiTrainer1();
        a.teach();

        a= new TestingTrainer1();
        a.teach();
    }
}

class Trainer1 {
    void teach() {
        System.out.println("Job is teaching");
    }
}

class JavaTrainer1 extends Trainer1{
  
    void teach() {
        System.out.println("Job is teaching Java");
    }
}

class AptiTrainer1 extends Trainer1 {
    
    void teach() {
        System.out.println("Job is teaching Aptitude");
    }
}

class TestingTrainer1 extends Trainer1 {
    
    void teach() {
        System.out.println("Job is teaching Testing");
    }
}



