/* Name: Dailiang Chen
 * Date: Mar 26, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output a line given user input
 * Major skills: Math, Algorithm, For Loops
 */

// import utilities
import java.util.*;

// class
public class Bars {

	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// keep program running
		while (true) {
			// prompt user input
			System.out.print("Enter a number between (1 and 30): ");
			int number = input.nextInt();

			if (number >= 1 && number <= 30) { // print the line given user input if input is valid
				for (int i = 1; i <= number; i++) {
					System.out.print("*");
				}
				System.out.println();
			} else { // otherwise ask the user again for a valid input
				System.out.println("Please use a number between (1 and 30)");
			}
		}
	}

}
