package performanceTask;

/* Name: Dailiang Chen
 * Date: April 26, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Build a software application (console based) that creates a ‘closet’ of shoes (just 5 for now).  
 * The application should display a title and a list of shoes in the ‘closet’ listed by increasing cost.  
 * Next, it prompts the user for their shoe size (re-prompt any invalid values).  
 * Then the number of shoes that are within half a size are displayed (see sample).  
 * Note, if no shoes will ‘fit’ then a different appropriate message should be displayed.
 * Major Skills: Objects, Arrays, Sorting, Scanner
 */

// import statement
import java.util.Scanner; // import scanner
import java.util.Arrays; // import arrays
import java.util.Comparator; // import comparator

// class
public class ClosetApplication {

	// closet array
	private static Closet[] closetArray = new Closet[5]; // object array

	// main method
	public static void main(String[] args) {
		fillShoes(); // fill object array
		showTitle(); // display title
		showShoesByCost(); // display array of objects (sorted by cost)
		double size = getYourSize(); // prompt user input for size
		showShoesThatFit(size); // display number of shoes that are +/-0.5 of the user's indicated shoes size
	}

	// fill shoes method
	private static void fillShoes() {
		// Fills the closet of shoes
		closetArray[0] = new Closet("Nike", "Air Max 90", 13, 155);
		closetArray[1] = new Closet("Jordan", "6 UNC", 11.5, 400);
		closetArray[2] = new Closet("Jordan", "1 Retro High Travis Scott", 8, 1338);
		closetArray[3] = new Closet("Adidas", "Yeezy Boost 350 V2", 10, 440);
		closetArray[4] = new Closet("Nike", "Air Force 1", 12, 140);

	}

	// show title method
	private static void showTitle() {
		// Displays the title of the application
		System.out.print("Shoes in the Closet\r\n" + "===================\r\n");

	}

	// display shoes by cost method
	private static void showShoesByCost() {
		// Displays all the shoes sorted by increasing cost (using code)
		Arrays.sort(closetArray, Comparator.comparing(Closet::getCost)); // sorts cost in ascending order
		for (int idx = 0; idx < closetArray.length; idx++)
			System.out.println(closetArray[idx]); // display objects

	}

	// get shoe size method
	private static double getYourSize() {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// ask user for shoes size
		System.out.print("What size shoe do you wear?\r\n");
		return input.nextDouble();
	}

	// shows shoes that fit method
	private static void showShoesThatFit(double size) {
		int counter = 0; // track the number of shoes that can fit
		for (int idx = 0; idx < closetArray.length; idx++) {
			// check if the shoes size is within the +/- 0.5 margin of user size
			if (size >= closetArray[idx].getSize() - 0.5 && size <= closetArray[idx].getSize() + 0.5)
				counter++; // valid shoes size counter increase
		}

		if (counter == 0)
			System.out.printf("No shoes are within half a size of %.1f", size); // no shoes fit
		else
			System.out.printf("%d shoe(s) are within half a size of %.1f", counter, size); // display the number of
																							// possible shoes

	}

}
