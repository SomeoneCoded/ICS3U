/* Name: Dailiang Chen
 * Date: Mar 19, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to check if user inputed a palindrome (mathematically and string manipulation
 * Major skills: Math, Algorithm, String manipulation
 */

// import scanner
import java.util.Scanner;

// class
public class Palindrome {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user input
		System.out.print("Enter an integer: ");
		String numberString = input.next();
		// convert string into integer
		int number = Integer.parseInt(numberString);
		
		// check if the user inputed a 5 digit number
		if ((number >= 10000 && number <= 99999) || numberString.length() == 5) {
			// store each digit
			int tenThousands = number / 10000;
			int thousands = number % 10000 / 1000;
			int hundreds = number % 10000 % 1000 / 100;
			int tens = number % 10000 % 1000 % 100 / 10;
			int ones = number % 10;
			// check for palindrome
			if (tenThousands == ones && thousands == tens) {
				System.out.println("Mathematically: This is a palindrome.");
			} else {
				System.out.println("Mathematically: This is not a palindrome.");
			}
			// string manipulation method:
			if (numberString.charAt(0) == numberString.charAt(4) && numberString.charAt(1) == numberString.charAt(3)) {
				System.out.println("String Manipulation: This is a palindrome.");
			} else {
				System.out.println("String Manipulation: This is not a palindrome.");
			}
		} else { // user input error
			System.out.println("Error: We are looking for a 5 digit integer.");
		}
	}

}
