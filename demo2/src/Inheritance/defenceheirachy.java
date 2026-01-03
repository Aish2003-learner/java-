package Inheritance;

public class defenceheirachy {

	public static void main(String[] args) {
		navy c=new navy();
		army d=new army();
		airforce  e=new airforce();
		d.protect();
		d.job();
		System.out.println(d.usetank());
		c.protect();
		c.job();
		System.out.println(c.useships());
		e.protect();
	    e.job();;
		System.out.println(e.usejets());
		
		
		

	}

}
class securityforce{
	
     void protect()
	{
    	 System.out.println("protect the nation");
		
	}
}
 class army extends securityforce{
	 void job()
		{
		 System.out.println("protect the land");
			
		}
	 
	 String usetank()
	 {
		 String b="uses tanks";
		 return b;
	 }
	 
 }
class navy extends securityforce{
	void job()
	{
	System.out.println("protect the ocean");
		
	}
	
	String useships()
	 {
		String f=("uses ships");
		return f;
	 }
	 
 }
class airforce extends securityforce{
	void job()
	{
		System.out.println("protect the air ");
		
	}
	String usejets()
	 {
		String g= "uses jets";
		return g;
	 }
	 
}
