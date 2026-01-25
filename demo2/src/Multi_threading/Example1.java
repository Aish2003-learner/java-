package Multi_threading;

//using extending thread class

public class Example1 {

	public static void main(String[] args) {
		Typing t1=new Typing();
		Spellcheck t2=new Spellcheck();
		Saving t3=new Saving();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
class Typing extends Thread
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
class Spellcheck extends Thread
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
class Saving extends Thread
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
