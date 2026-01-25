package Multi_threading;

public class withoutjoin_ {
	
	public static void main(String[] args) {
		System.out.println("application started");
		Thread t1=new Thread(new Typing10());
		Thread t2=new Thread(new Spellcheck10());
		Thread t3=new Thread(new Saving10());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("application terminated");
		
	}

}
class Typing10 implements Runnable
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
class Spellcheck10 implements Runnable
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
class Saving10 implements Runnable
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


