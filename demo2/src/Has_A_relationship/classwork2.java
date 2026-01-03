package Has_A_relationship;

public class classwork2 {
	public static void main(String []args)
	{
	student1 s=new student1();
	Bike12 B= new Bike12("honda",650000,"red");
	Book1 bo= new Book1(650,"romantic");
	s.HasA12(B);
	s.HasA2(bo);
	System.out.println(s.b.getjob());
	System.out.println(s.b.getIQ());
	System.out.println(s.h.getJob1());
	System.out.println(s.h.getWeight());

}

}

class human 
{
	Brain1 b=new Brain1("control body",130);
	Heart12 h=new Heart12("pumping blood",300);

	
	
}

class student1 extends human
{
	void HasA12(Bike12 B)
	{
		System.out.println(B.getBrand());
		System.out.println(B.getPrice());
		System.out.println(B.getColour());
	}
	void HasA2(Book1 bo)
	{
		System.out.println(bo.getpages());
		System.out.println(bo.getgenre());
		
	}

}
class Heart12
{
String job;
int weight; // in grams

Heart12(String job, int weight) {
    this.job = job;
    this.weight = weight;
}

String getJob1()
{
    return job;
}

int getWeight() {
    return weight;
}

}
class Book1
{
int pages;
String genre;


Book1(int pages,String genre)
{
	this.pages=pages;
	this.genre=genre;
}

int getpages()
{
	return pages;
}
String getgenre()
{
	return genre;
}


}
class Bike12 
{
 String brand;
    int price;
    String colour;

    Bike12(String brand, int price, String colour) {
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
class Brain1
{
String job;
int IQ;
 Brain1(String job,int IQ)
 {
	 this.job=job;
	 this.IQ=IQ;
	
 }
 String getjob()
 {
	 return job;
 }
 int getIQ() {
	 return IQ;
 }

}
