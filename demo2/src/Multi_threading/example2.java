package Multi_threading;

//using runnable interface

public class example2 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Typing1());
		Thread t2=new Thread(new Spellcheck1());
		Thread t3=new Thread(new Saving1());
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class Typing1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("typing....");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
class Spellcheck1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Spell check....");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
class Saving1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("saving....");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}


	}


