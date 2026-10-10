/* Name: Dailiang Chen
 * Date: Mar 28, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to create a diamond pattern given user input
 * Major skills: Math, Algorithm, for loops, while loops
 */

// implement utilities
import java.util.*;

// class
public class Diamond2 {
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// keep running the program
		while (true) {
			// ask for user input
			System.out.print("Enter odd number of rows (1-19): ");
			int number = input.nextInt();

			// check if the input is valid
			if ((number >= 1 && number <= 19) && number % 2 == 1) {
				// top half
				for (int row = 1, reverseRow = (number - 1) / 2; row <= (number - 1) / 2; row++, reverseRow--) {
					for (int spaces = reverseRow; spaces >= 1; spaces--) { // spaces
						System.out.print(" ");
					}
					for (int stars = 1; stars <= 2 * row - 1; stars++) { // stars
						System.out.print("*");
					}
					// new row
					System.out.println();
				}
				// middle
				for (int stars = 1; stars <= number; stars++) { // stars
					System.out.print("*");
				}
				// new row
				System.out.println();

				// bottom half
				for (int row = 1, reverseRow = (number - 1) / 2; row <= (number - 1) / 2; row++, reverseRow--) {
					for (int spaces = 1; spaces <= row; spaces++) { // spaces
						System.out.print(" ");
					}
					for (int stars = reverseRow * 2 - 1; stars >= 1; stars--) { // stars
						System.out.print("*");
					}
					// new row
					System.out.println();
				}
			} else { // ask the user for a valid input
				System.out.print("Please try again.\n");
			}
		}

	}
}
