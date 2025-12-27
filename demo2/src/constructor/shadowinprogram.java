package constructor;

import java.util.Scanner;

public class shadowinprogram {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        student s = new student();
        System.out.println("please enter the name,age,gender");
		String name = sc.next();
		int age  = sc.nextInt();
		String gender  = sc.next();
		 s.setInfo(name,age,gender);

        System.out.println("Name : " + s.getName());
        System.out.println("Age  : " + s.getAge());
        System.out.println("Gender: " + s.getGender());
    }
}



/*class student {

    private String name;
    private int age;
    private String gender;

    public void setInfo(String name ,int age,String gender) {
        name = name;
        age = age ;
        gender = gender;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


	}*/

//OUTPUT IS NULL



class student {

    private String name;
    private int age;
    private String gender;

    public void setInfo(String name ,int age,String gender) {
        this.name = name;
        this.age = age ;
        this.gender = gender;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


	}
