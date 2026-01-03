package Abstraction;

public class example1 {
	
		public static void main(String[] args) {
		
			
			duty(new army());
			
			
			duty(new  navy());
			
			
			duty(new airforce());
			
			}
		static void duty(securityforce d)
		{
			d.job();
		}

	}
	abstract class securityforce{
		
	    abstract void job();
		
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





