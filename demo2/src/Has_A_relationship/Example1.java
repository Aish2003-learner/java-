package Has_A_relationship;

public class Example1 {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		Charger c= new Charger("dell",65);
		l.hasA(c);
		
		System.out.println(l.os.getbrand());
		System.out.println(l.os.getversion());
		

	}

}


class Laptop
{
	OS os=new OS("win",10);
	void hasA(Charger c)
	{
		System.out.println(c.getbrand());
		System.out.println(c.getpower());
		
	}
	 
}



class Charger
{
	String brand;
	int power;
	
	public Charger(String brand,int power)
	  {
		  this.brand=brand;
		  this.power=power;
	  }
	 String getbrand()
	  {
		  return brand;
	  }
	 int getpower()
	  {
		  return power;
	  }
	}






class OS
{
	String brand;
	int version;
	
  OS(String brand,int version)
  {
	  this.brand=brand;
	  this.version=version;
	  
  }
  
  String getbrand()
  {
	  return brand;
  }
  int getversion()
  {
	  return version ;
  }

}
