/* Name: Dailiang Chen
 * Date: Mar 7, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to check for the top 2 highest values
 * Major skills: Math, Algorithm, While Loops
 */

// implement scanner and array
import java.util.Arrays;
import java.util.Scanner;

// class
public class HighestTwo {
	
	// main method
	public static void main(String[] args) {
		// implement scannert
				Scanner input = new Scanner(System.in);
				// array with size 10
				int [] array = new int[10];
				// track the amount of user input
				int iterator = 0;
				// while loop
				while(iterator < 10) {
					// get user input
					System.out.printf("Enter integer number %d:\n", iterator+1);
					array[iterator] = input.nextInt();
					iterator++;
				}
				
				// Sort in ascending order
				Arrays.sort(array);
				// Output
				System.out.printf("The largest number is %d. The second largest number is %d.", array[9], array[8]);

	}

}
