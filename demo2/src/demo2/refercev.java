package demo2;

/*public class refercev {
	public static void main(String[] args)   //
	 {
			student st=new student();
		System.out.print(st);
	}

}
class student
{
	String name;
	
}*/


public class refercev {
	public static void main(String[] args) {
		
		Usestudent as=new Usestudent();
		student res = as.dispStudent();
		System.out.print(res);
	}

}
class student
{
	String name;
	
}
class Usestudent
{
	student dispStudent()
	{
		student s=new student();
		return s;
	}
}