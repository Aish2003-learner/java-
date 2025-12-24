package demo2;

public class methodoverloading {

	public static void main(String[] args) {
	  calculator a=new calculator();
	   System.out.println(a.add(10,20));		

	}

}

class calculator
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	float add(int a,float b)
	{
		float sum=a+b;
		return sum;
	}
	float add(float a,int b)
	{
		float sum=a+b;
		return sum;
	}
    double add(double a,double b)
	{
		double sum=a+b;
		return sum;
	}
    double add(double a,double b,double c)
    {
		double sum=a+b+c;
		return sum;
	}
    double add(float a,int b,double c)
	{
		double sum=a+b+c;
		return sum;
	}
    double add(double a,float b,int c)
	{
		double sum=a+b+c;
		return sum;
	}
}