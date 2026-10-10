/* Name: Dailiang Chen
 * Date: April 2, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to find the time for bacteria growth
 * Major skills: Math, Algorithm, for loops
 */

// implement scanner
import java.util.Scanner;
// class
public class Bacteria {
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// prompt user input
		System.out.print("Enter the final size:\n");
		int finalSize = input.nextInt();
		// store time
		double time = 0;
		// check for valid time
		while((int) Math.pow(2, time/3.2) <= finalSize) {
			if((int) Math.pow(2, time/3.2) == finalSize) break;
			else time+=0.01;
		}
		// check if final size is valid
		if(finalSize > 1)
			System.out.printf("The final size will be reached in %.1f seconds", time);
		else
			System.out.print("Error: Not a valid final size.");
	}

}
