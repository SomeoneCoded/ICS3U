/* Name: Dailiang Chen
 * Date: Mar 25, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output the smallest number
 * Major skills: Math, Algorithm, For Loops
 */

// import utilities
import java.util.*;

// class
public class Smallest {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user input
		System.out.print("How many numbers do you want to input?: ");
		int counter = input.nextInt();// Enter first number
		System.out.print("Enter number 1: ");
		int number = input.nextInt();
		int smallest = number;
		
		// Continue processing more numbers
		for(int i = 2; i <= counter; i++) {
			// Process more numbers
			System.out.printf("Enter number %d: ", i);
			number = input.nextInt();
			// Check if the number is smaller than the "smallest" number
			if(number < smallest) {
				smallest = number;
			}
		}
		
		// Output
		System.out.printf("The smallest integer you inputted is %d", smallest);
	}

}
