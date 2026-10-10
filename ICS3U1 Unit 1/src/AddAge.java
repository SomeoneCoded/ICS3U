//Name: Dailiang Chen
//Date: February 12, 2024
//Course: ICS3U1-04 - Mr.Fernandes
// Description: Write a program that reads a first name, a last name and an age.  Concatenate (join) the information so that it displays the message shown below.

// import utilities
import java.util.*;

// Make class
public class AddAge {

	// Make main method
	public static void main(String[] args) {

		// Implement scanner
		Scanner sc = new Scanner(System.in);

		// Inputs
		System.out.print("Enter your first name: ");
		String firstname = sc.next();
		System.out.print("\nEnter your last name: ");
		String lastname = sc.next();
		System.out.print("\nEnter your current age: ");
		int age = sc.nextInt();

		// Process + Output
		System.out.printf("%s %s, next year you will be %d years old.", firstname, lastname, (int) age + 1);

	}

}
