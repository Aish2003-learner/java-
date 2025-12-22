package demo2;

 class fan_has {
	String brand;
	int wings;

}

public class fan
{
	public static void main(String[] args) {
		fan_has s1 = new fan_has();
		s1.brand="orient";
		s1.wings= 4;
		fan_has s2 = new fan_has();
		s2.brand="bajaj";
		s2.wings= 3;
		
		System.out.println(s1.brand);
		System.out.println(s1.wings);
		System.out.println(s2.brand);
		System.out.println(s2.wings);
		
		
	}
}
