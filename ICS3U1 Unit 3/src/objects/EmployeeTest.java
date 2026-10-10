package objects;

// class
public class EmployeeTest {
	
	// main
	public static void main(String[] args) {
		// objects
		Employee employee1 = new Employee("Christiano", "Ronaldo", 30.10);
		Employee employee2 = new Employee("Kim", "Wong", 45.00);
		
		// set raise
		employee1.raise(4.10);
		employee2.raise(10.00);
		
		// output the objects
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		
	}

}
