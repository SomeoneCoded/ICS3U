package objects;

public class BasketballPlayer {
	
	// fields, properties, attributes
	private String name;
	private String team;
	private int number;
	private double height;
	private int age;
	

	// constructor method: Has to be the same name as the class
	public BasketballPlayer(String name, String team, int number, double height, int age) {
		super(); // creates a general object
		this.name = name;
		this.team = team;
		this.number = number;
		this.height = height;
		this.age = age;
	}

	// get and set methods
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	//  display the object on the console
	@Override
	public String toString() {
		return "BasketballPlayer [name=" + name + ", team=" + team + ", number=" + number + ", height=" + height
				+ ", age=" + age + "]";
	}
	
	// utility methods (for actions) would go below:
	
	
}
