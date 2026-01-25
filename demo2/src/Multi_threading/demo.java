package Multi_threading;

public class demo {

/*	public static void main(String[] args) { //printing default thread [#1,main,5,main]
		Thread t=Thread.currentThread();
		System.out.println(t);

	}

}*/
	public static void main(String[] args) { 
		Thread t=Thread.currentThread();
		t.setName("pce");
		t.setPriority(7);
		System.out.println(t); //#1,pce,7,main
		duty();                //#1,pce,7,main

	}
	static void duty()
	{
		Thread t= Thread.currentThread();
		System.out.println(t);
	}

}