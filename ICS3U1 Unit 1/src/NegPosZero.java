//Name: Dailiang Chen
//Date: February 13, 2024
//Course: ICS3U1-04 - Mr.Fernandes
//Description: Write an application that inputs five numbers and determines and prints the number of negative, positive and zero numbers that were input. 

// import utilities
import java.util.*;

// Make class
public class NegPosZero {

	// Make main method
	public static void main(String[] args) {

		// Implement scanner
		Scanner sc = new Scanner(System.in);

		// Input how many numbers we are processing
		System.out.print("How many numbers are you inputting: ");
		int N = sc.nextInt();

		// Variables to store positive, negative, and zeros
		int positive = 0;
		int negative = 0;
		int zeros = 0;

		// Process
		for (int i = 0; i < N; i++) {

			// Input numbers
			System.out.print("Enter a number: ");
			int num = sc.nextInt();

			// Process to check what kind of numbers are the input
			if (num > 0)
				positive++;
			else if (num < 0)
				negative++;
			else
				zeros++;
		}

		// Output
		System.out.printf("%d negative number(s)\n%d positive number(s)\n%d zeros", negative, positive, zeros);
	}

}
