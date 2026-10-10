package objects;

// import
import java.util.Scanner;

// class
public class DateTest {

	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// input date
		System.out.print("Enter a date MM/DD/YYYY: ");
		Date date1 = new Date(input.nextInt(), input.nextInt(), input.nextInt());
		
		// display the date if valid
		if(date1.getMonth()!= 0 && date1.getDay() != 0 && date1.getYear() != 0) { // display date
			System.out.println(date1.displayDate(date1.getMonth(), date1.getDay(), date1.getYear()));
		}
	}

}
