package constructor;
//how can we call other main method
public class mainoverloading {
	public static void main(String[] args) {
		System.out.println("hello");
		main(10);
		main(20.0f);
		main("nsnd");

	}
	public static void main(int a) {
		System.out.println("hello1");

	}
	public static void main(float b) {
		System.out.println("hello2");

	}
	public static void main(String g) {
		System.out.println("hello3");

	}
}



