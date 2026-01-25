package Multi_threading;

public class code_editor {
	
	public static void main(String[] args) 
	{
		code t1=new code();
		code t2=new code();
		code t3=new code();
		
		t1.setName("type");
		t2.setName("spell");
		t3.setName("save");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}


class code extends Thread
{
	
	public void run()
	{
		String tName =Thread.currentThread().getName();
		if(tName.equals("type"))
		{
			Typing();
		}
		else if(tName.equals("spell"))
		{
			Spell();
		}
		else
		{
			Saving();
		}
		
	}
	public void Typing()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("typing....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
	}


	public void Spell()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Spell check....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
	}


	public void Saving()
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println("saving....");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
		
	}



}
