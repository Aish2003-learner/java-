package Multi_threading;

public class holdmainthread {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("application started");
		Thread t1=new Thread(new Typing10());
		Thread t2=new Thread(new Spellcheck2());
		Thread t3=new Thread(new Saving2());
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("application terminated");
		
	}

}
class Typing2 implements Runnable
{
	public void run()
	{
		System.out.println("typing started");
		for(int i=0;i<10;i++)
		{
			System.out.println("typing....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		System.out.println("typing terminated");
	}
}
class Spellcheck2 implements Runnable
{
	public void run()
	{
		System.out.println("spell check started");
		for(int i=0;i<10;i++)
		{
			System.out.println("Spell check....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		System.out.println("spell check terminated");
	}
}
class Saving2 implements Runnable
{
	public void run()
	{
		System.out.println("saving started");
		for(int i=0;i<10;i++)
		{
			System.out.println("saving....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		System.out.println("saving terminated");
	}


	}

