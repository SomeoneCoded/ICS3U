package objects;

public class Employee {
	
	// instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// constructor method
	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		setSalary(monthlySalary);
	}
	
	// setters and getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return monthlySalary;
	}
	public void setSalary(double monthlySalary) {
		if(monthlySalary < 0.00)
			monthlySalary = 0.00;
		this.monthlySalary = monthlySalary;
	}
	
	// to String
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", monthlySalary=" + monthlySalary + "]";
	}
	
	// utility method
	public void raise(double raise) {
		if(raise < 0.00)
			raise = 0.00;
		monthlySalary+=raise;
	}
}
