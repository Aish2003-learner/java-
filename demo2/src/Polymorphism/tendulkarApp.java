package Polymorphism;

public class tendulkarApp {

	public static void main(String[] args) {
		tendulkar t=new arjun();
		t.job();
		t.profession();      // que. why we need method overriding?
		t.smoke();         //parent class object does not access the specialized method of child class thats 
		                   //why we need to use method overriding for reduce code redundancy
		
		
		//((arjun)t).smoke(); //to overcome t.smoke               
	}

}

class tendulkar
{
	void job()
	{
		System.out.println("play cricket");
	}
	void profession()
	{
		System.out.println("he is batsman");
	}

}

class arjun extends tendulkar
{
	void job()
	{
		System.out.println("play cricket");
	}
	void profession()
	{
		System.out.println("he is bowler");
	}
	void smoke()
	{
		System.out.println("he smoke some time");
	}

	
}