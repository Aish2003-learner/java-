package Has_A_relationship;

public class classwork_1 {

	public static void main(String[] args) {
		student la=new student();
		Bike1 B= new Bike1("honda",650000,"red");
		Book bo= new Book(650,"romantic");
		la.HasA12(B);
		la.HasA2(bo);
		System.out.println(la.b.getjob());
		System.out.println(la.b.getIQ());
		System.out.println(la.h.getJob1());
		System.out.println(la.h.getWeight());

	}

}

class student
{
	Brain b=new Brain("control body",130);
	Heart1 h=new Heart1("pumping blood",300);
	
	void HasA12(Bike1 B)
	{
		System.out.println(B.getBrand());
		System.out.println(B.getPrice());
		System.out.println(B.getColour());
	}
	void HasA2(Book bo)
	{
		System.out.println(bo.getpages());
		System.out.println(bo.getgenre());
		
	}
	
}
class Heart1
{
	String job;
    int weight; // in grams

    Heart1(String job, int weight) {
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
class Book
{
	int pages;
    String genre;
	
	
	Book(int pages,String genre)
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
class Bike1 
{
	 String brand;
	    int price;
	    String colour;

	    Bike1(String brand, int price, String colour) {
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
class Brain
{
	String job;
	int IQ;
	 Brain(String job,int IQ)
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