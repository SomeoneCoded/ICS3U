package performanceTask;

// import statements
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// class
public class TreatyApplication {

	// object array
	private static Treaty[] treatyArray = new Treaty[7];

	// main method
	public static void main(String[] args) {
		fillArray(); // fill array
		displayTitle(); // display title
		displayArray(); // display sorted array
		int year = getYear(); // get a year
		displayNumTreaty(year); // determine the number of treaties signed given the year

	}

	private static void fillArray() {
		// fill up the array
		treatyArray[0] = new Treaty("Douglas Treaties", 14, 1850, 1854);
		treatyArray[1] = new Treaty("Numbered Treaties", 11, 1871, 1921);
		treatyArray[2] = new Treaty("Robinson Treaties", 2, 1850, 1850);
		treatyArray[3] = new Treaty("Williams Treaties", 2, 1923, 1923);
		treatyArray[4] = new Treaty("Upper Canada Land Surrenders", 30, 1781, 1862);
		treatyArray[5] = new Treaty("Peace & Neutrality Treaties", 3, 1701, 1760);
		treatyArray[6] = new Treaty("Maritime Peace and Friendship Treaties", 8, 1725, 1779);

	}

	private static void displayTitle() {
		// display title
		System.out.print("HISTORIC TREATIES IN CANADA\r\n" + "===========================\r\n" + "");

	}

	private static void displayArray() {
		// sort the array
		Arrays.sort(treatyArray, Comparator.comparing(Treaty::getNumber));
		// print the array
		for (int idx = 0; idx < treatyArray.length; idx++)
			System.out.println(treatyArray[idx]);

	}

	private static int getYear() {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// get the number of years
		int year = 0;
		do {
			System.out.println("Enter the year you wish to see?");
			year = input.nextInt();
			if (year < 0) // all invalid entries require user input
				System.out.println("Invalid year. Try again.");
		} while (year < 0);

		// return user input
		return year;
	}

	private static void displayNumTreaty(int year) {
		int counter = 0; // stores how many signed treaties
		for (int idx = 0; idx < treatyArray.length; idx++) { // goes through the array
			// check if the treaties are signed
			if (year >= treatyArray[idx].getStartYear() && year <= treatyArray[idx].getEndYear())
				counter++;

		}

		// display the number of signed treaties
		System.out.printf("%d treaty group(s) were signed during %d.", counter, year);

	}

}
