package performanceTask;

/* Name: Dailiang Chen
 * Date: April 26, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Build a software application (console based) that creates a ‘closet’ of shoes (just 5 for now).  
 * The application should display a title and a list of shoes in the ‘closet’ listed by increasing cost.  
 * Next, it prompts the user for their shoe size (re-prompt any invalid values).  
 * Then the number of shoes that are within half a size are displayed (see sample).  
 * Note, if no shoes will ‘fit’ then a different appropriate message should be displayed.
 * Major Skills: Objects, constructors, setters and getters, to string 
 */

// class
public class Closet {
	
	// instance variables (fields)
	private String brand;
	private String name;
	private double size;
	private int cost;
	
	// constructor
	public Closet(String brand, String name, double size, int cost) {
		super(); // creates constructor
		this.brand = brand; //set brand name
		this.name = name; // set shoe name
		setSize(size); // validate and set shoe size
		setCost(cost); // validate and set cost
	}
	
	// setters and getters
	public String getBrand() { //get brand
		return brand;
	}
	public void setBrand(String brand) { // set brand
		this.brand = brand;
	}
	public String getName() { // get name
		return name;
	}
	public void setName(String name) { // set name
		this.name = name;
	}
	public double getSize() { // get size
		return size;
	}
	public void setSize(double size) { // set size
		if(size < 0) // if size is negative, set it to zero
			size = 0;
		this.size = size; 
	}
	public int getCost() { // get cost
		return cost;
	}
	public void setCost(int cost) { // set cost
		if(cost < 0) // if cost is negative, set it to zero
			cost = 0;
		this.cost = cost;
	}
	
	// to string method
	@Override
	public String toString() { // display object and its attributes
		return "Closet [brand=" + brand + ", name=" + name + ", size=" + size + ", cost=" + cost + "]";
	}
	
}
