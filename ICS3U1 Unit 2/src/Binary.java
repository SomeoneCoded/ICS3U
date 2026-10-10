/* Name: Dailiang Chen
 * Date: Mar 19, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to convert binary into decimal
 * Major skills: Math, Algorithm, String manipulation
 */

// import scanner
import java.util.Scanner;

// class
public class Binary {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user input
		System.out.print("Enter your binary number: ");
		String numberStringReverse = input.next();
		// convert string into integer
		long number = Long.parseLong(numberStringReverse);
		// put string into a char array
		char[] numberString = new char[numberStringReverse.length()];
		for (int i = 0, j = numberStringReverse.length() - 1; i < numberStringReverse.length(); i++, j--) {
			numberString[i] = numberStringReverse.charAt(j);
		}

		// Mathematically:
		int decimal = 0;
		int power = 0;
		while(number > 0) {
			if(number % 10 == 1) {
				decimal += Math.pow(2, power);
				power++;
				number/=10;
			}
		}
		System.out.printf("\nThe number in decimal form is %d. This was found using math.", decimal);

		// String manipulation:
		int decimalString = 0;
		for (int i = 0, j = numberStringReverse.length() - 1; i < numberStringReverse.length(); i++, j--) {
			if (numberString[i] == '1') // if index i is 1, Math.pow(2, i);
				decimalString += Math.pow(2, i);
		}
		
		// Output
		System.out.printf("\nThe number in decimal form is %d. This was found using string manipulation.", decimalString);
	}

}
