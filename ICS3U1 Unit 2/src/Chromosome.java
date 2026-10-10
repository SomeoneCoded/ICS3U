/* Name: Dailiang Chen
 * Date: April 2, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to create a chromosome pattern
 * Major skills: Math, Algorithm, for loops
 */

// implement scanner
import java.util.Scanner;
// class
public class Chromosome {
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);

		while (true) {
			// Prompt user input
			System.out.print("Enter a size (between 1-8) of the arms of a chromosome: ");
			int size = input.nextInt();
			if (size >= 1 && size <= 8) {
				// Print the top half of the chromosome
				for (int row = size; row > 0; row--) {
					for (int spaces = size - row; spaces > 0; spaces--) // outside spaces
						System.out.print(" ");
					System.out.print("*"); // first star
					for (int spaces = row * 2; spaces > 0; spaces--) // spaces in between
						System.out.print(" ");
					System.out.print("*"); // second star
					System.out.println(); // new row
				}

				// Print the centromere
				for (int spaces = size; spaces > 0; spaces--) // outside spaces
					System.out.print(" ");
				System.out.print("**\n");

				// Print the bottom half of the chromosome
				for (int row = 1; row <= size; row++) {
					for (int spaces = size - row; spaces > 0; spaces--) // outside spaces
						System.out.print(" ");
					System.out.print("*"); // first star
					for (int spaces = row * 2; spaces > 0; spaces--) // spaces in between
						System.out.print(" ");
					System.out.print("*"); // second star
					System.out.println(); // new row
				}
			} else
				System.out.println("Please enter a valid input: "); // ask for a valid input
		}

	}

}
