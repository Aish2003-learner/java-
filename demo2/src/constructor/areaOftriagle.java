package constructor;

public class areaOftriagle {

	public static void main(String[] args) {
		

		System.out.println( getTriangle.half);
	getTriangle sd= new getTriangle(5,4);
	System.out.println(sd.disp());
	
}

}

class getTriangle
{
int b;
int l;
static float half=0.5f;
float area;

public getTriangle(int l,int b)
{
	this.l=l;
	this.b=b;
	
}
public float disp() {
	area=half*(l*b);
	return area;
}
}

