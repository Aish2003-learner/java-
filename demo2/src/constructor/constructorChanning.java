package constructor;

public class constructorChanning {

	//LOCAL CHAINNIG------------------
		public static void main(String[] args)
		{
			Employee e = new Employee();
		}

	}

	class Employee{
		
		int emp_id;
		String name;
		int salary;
		
		public Employee() {
			this(101,"Arsh",20);
			System.out.println(" 0 parameterized constructor called");
		}
		
		public Employee(int emp_id) {
			System.out.println("1 parameterized constructor called");
		}
		
		public Employee(int emp_id,String name) {
			this(101); 
			System.out.println("2 parameterized constructor called");
		}
		
		public Employee(int emp_id,String name,int salary) {
			this(101,"arsh");
			System.out.println("3 parameterized constructor called");
		}
	}
	