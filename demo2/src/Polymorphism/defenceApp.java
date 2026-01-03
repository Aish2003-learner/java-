package Polymorphism;



public class defenceApp {
	public static void main(String[] args) {
		navy c=new navy();
		army d=new army();
		
		
		duty(new army());
		
		
		duty(new  navy());
		
		
		duty(new airforce());
		
		}
	static void duty(securityforce d)
	{
		d.job();
	}

}
class securityforce{
	
     void job()
	{
    	 System.out.println("protect the nation");
		
	}
}
 class army extends securityforce{
	 void job()
		{
		 System.out.println("protect the land");
			
		}
	 
	
 }
class navy extends securityforce{
	void job()
	{
	System.out.println("protect the ocean");
		
	}
	
	 
 }
class airforce extends securityforce{
	void job()
	{
		System.out.println("protect the air ");
		
	}
	
}




