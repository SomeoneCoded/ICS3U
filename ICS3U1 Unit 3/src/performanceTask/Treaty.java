package performanceTask;

// class
public class Treaty {

	// instance variables
	private String name;
	private int number;
	private int startYear;
	private int endYear;
	
	// constructor
	public Treaty(String name, int number, int startYear, int endYear) {
		super();
		this.name = name;
		this.number = number;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getEndYear() {
		return endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	
	// to string method
	@Override
	public String toString() {
		return "Treaty [name=" + name + ", number=" + number + ", startYear=" + startYear + ", endYear=" + endYear
				+ "]";
	}
	
	
	
}
