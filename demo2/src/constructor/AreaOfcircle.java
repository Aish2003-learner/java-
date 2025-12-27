package constructor;

public class AreaOfcircle {

	public static void main(String[] args) {
		getCircle sd= new getCircle(4);
		System.out.println(sd.disp());
		
	}

}

class getCircle
{
	int r;
	static float pi=3.14f;
	float area;
	
	public getCircle(int r)
	{
		this.r=r;
		
	}
	public float disp() {
		area=pi*(r*r);
		return area;
	}
}