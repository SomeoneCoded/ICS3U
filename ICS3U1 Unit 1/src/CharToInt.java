//Name: Dailiang Chen
//Date: February 13, 2024
//Course: ICS3U1-04 - Mr.Fernandes
// Description: Write an application that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.

// import all utilities
import java.util.*;

// Make class
public class CharToInt {

	// Make main method
	public static void main(String[] args) {

		// Implement scanner
		Scanner sc = new Scanner(System.in);

		// Input a character
		System.out.print("Enter a character: ");
		String ch = sc.nextLine();

		// Convert character to ASCII value
		System.out.printf("The ASCII value of '%s' is %d ", ch, (int) ch.charAt(0));
	}

}
