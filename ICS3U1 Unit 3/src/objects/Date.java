package objects;

// class
public class Date {
	// instance variable
	private int month;
	private int day;
	private int year;

	// constructor method
	public Date(int month, int day, int year) {
		super();
		setMonth(month);
		setYear(year);
		setDay(day);

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
		else
			System.out.println("Invalid month");

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 31)
			System.out.println("Invalid day");
		else if ((month == 4 || month == 7 || month == 9 || month == 11) && day > 30) // months with only 30 days
			System.out.println("Invalid day");
		else if (month == 2) { // february leap year
			if (year % 100 == 0) { // end of century
				if(year % 400 == 0 && day > 29)
					System.out.println("Invalid day");
				else if(year % 400 != 0 && day > 28)
					System.out.println("Invalid day");
				else
					this.day = day;
			} else {
				if (year % 4 == 0 && day > 29)
					System.out.println("Invalid day");
				else if (year % 4 != 0 && day > 28)
					System.out.println("Invalid day");
				else
					this.day = day;
			} 
		} else
			this.day = day;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 0)
			System.out.println("Invalid year");
		else
			this.year = year;
	}

	// to String method
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

	// utility method
	public String displayDate(int month, int day, int year) {
		return month + "/" + day + "/" + year;
	}
}
