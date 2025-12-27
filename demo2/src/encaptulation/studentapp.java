package encaptulation;

import java.util.Scanner;

/*public class studentapp {
    public static void main(String[] args) {
    	
    	Scanner sc =new Scanner(System.in);
        student s = new student();
        System.out.println("please enter the name");
		String name = sc.next();

        s.setName(name);
        System.out.println("please enter the age");
        int age  = sc.nextInt();
        s.setAge(age);
        System.out.println("please enter the gender");
        String gender  = sc.next();
        s.setGender(gender);

        System.out.println("Name   : " + s.getName());
        System.out.println("Age    : " + s.getAge());
        System.out.println("Gender : " + s.getGender());
    }
}


class student {

    private String name;
    private int age;
    private String gender;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setGender(String g) {
        gender = g;
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
public class studentapp {
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


class student {

    private String name;
    private int age;
    private String gender;

    public void setInfo(String n,int a,String g) {
        name = n;
        age = a;
        gender = g;
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

