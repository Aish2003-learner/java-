package Has_A_relationship;

public class Example2 {

    public static void main(String[] args) {

        Student s = new Student("Yash", 22);

        Bike b = new Bike("Apache", 120000, "Black");
        s.hasA(b);

        System.out.println(s.heart.getJob());
        System.out.println(s.heart.getWeight());
    }
}

/* ================= Student ================= */

class Student {

    String name;
    int age;

    Heart heart = new Heart("Pumping Blood", 300);

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hasA(Bike b) {
        System.out.println(b.getBrand());
        System.out.println(b.getPrice());
        System.out.println(b.getColour());
    }
}

/* ================= Bike ================= */

class Bike {

    String brand;
    int price;
    String colour;

    Bike(String brand, int price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    String getBrand() {
        return brand;
    }

    int getPrice() {
        return price;
    }

    String getColour() {
        return colour;
    }
}

/* ================= Heart ================= */

class Heart {

    String job;
    int weight; // in grams

    Heart(String job, int weight) {
        this.job = job;
        this.weight = weight;
    }

    String getJob() {
        return job;
    }

    int getWeight() {
        return weight;
    }
}

