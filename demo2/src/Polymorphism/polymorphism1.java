package Polymorphism;

public class polymorphism1 {
  //no polymorphisn
    public static void main(String[] args) {

        JavaTrainer a = new JavaTrainer();
        a.teach();

        AptiTrainer b = new AptiTrainer();
        b.teach();

        TestingTrainer c = new TestingTrainer();
        c.teach();
    }
}

class Trainer {
    void teach() {
        System.out.println("Job is teaching");
    }
}

class JavaTrainer extends Trainer {
  
    void teach() {
        System.out.println("Job is teaching Java");
    }
}

class AptiTrainer extends Trainer {
    
    void teach() {
        System.out.println("Job is teaching Aptitude");
    }
}

class TestingTrainer extends Trainer {
    
    void teach() {
        System.out.println("Job is teaching Testing");
    }
}
