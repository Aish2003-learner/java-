package demo2;

public class stringfunction {
	public static void main(String[] args) {
		String s1 = "Arsh";
		String s2 ="Md Arsh";
		System.out.println(s1.toUpperCase()); // immutable string can't be changed
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("Ar"));
		System.out.println(s1.indexOf("r"));
		System.out.println(s2.substring(3));
		System.out.println(s2.substring(0,2));
		System.out.println(s2.charAt(3));
		
		
		//mutable
		
		StringBuffer sc = new StringBuffer();
		sc.append("Ronaldo");
		System.out.println(sc.capacity());
		sc.append("is a great footballer ");
		System.out.println(sc.capacity());
		StringBuffer sb = new StringBuffer(10);
		System.out.println(sb.capacity());//10
		
		//ensure capacity
		
		StringBuffer a = new StringBuffer();
		System.out.println(a.capacity());//16
		a.ensureCapacity(31);
		System.out.println(a.capacity());//34
		StringBuffer b = new StringBuffer();
		System.out.println(b.capacity());
		b.append("ronaldo");
		b.trimToSize();
		System.out.println(b.capacity());//7
		
		
		

		
	}		
	}


