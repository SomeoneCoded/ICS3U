//Name: Dailiang Chen
//Date: February 12, 2024
//Course: ICS3U1-04 - Mr.Fernandes
//Description: Write an application that inputs one number consisting of five digits from the user, separates the number into individual digits and prints the digits separated. 

// import all utilities
import java.util.*;

// Make class
public class Digits {

	// Make main method
	public static void main(String[] args) {

		// Implement scanner
		Scanner sc = new Scanner(System.in);

		// Input number as a string
		String num = sc.next();

		// Process
		for (int i = 0; i < num.length(); i++) {

			// At each position of the string, we print a space
			System.out.print(num.charAt(i) + " ");
		}
	}

}
