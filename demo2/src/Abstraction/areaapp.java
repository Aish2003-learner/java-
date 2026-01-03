package Abstraction;



public class areaapp {
	public static void main(String[] args) {
		
		duty(new getCircle(3));
		duty(new getTriangle(5,3));
		duty(new getsquare(6));
		
		
	}
	static void duty(area d)
	{
		d.findarea();
		d.disp();
	}


}

abstract class area 
{
	static float pi=3.14f;
	static float half=0.5f;
	abstract  void findarea();
	abstract void disp();
}

class getCircle extends area
{
	int r;
	
	float area;
	
	public getCircle(int r)
	{
		this.r=r;
		
	}
	public void findarea()
	{
		area=pi*(r*r);
	}
	public void disp() {
		
		System.out.println(area);
	}
}
class getTriangle extends area
{
int b;
int l;

float area;

public getTriangle(int l,int b)
{
	this.l=l;
	this.b=b;
	
}
public void findarea()
{
	area=half*(l*b);
}
public void disp() {
	
	System.out.println(area);
}
}
class getsquare extends area
{
int s;
float area;

public getsquare(int s)
{
	this.s=s;
	
	
}
public void findarea()
{
	area=s*s;
}
public void disp() {

	
	System.out.println(area);
}
}

