/* Name: Dailiang Chen
 * Date: Mar 7, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to check for the top 2 highest values
 * Major skills: Math, Algorithm, While Loops
 */

// implement a scanner
import java.util.Scanner;
// class
public class Table {
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// Get user input
		System.out.println("Enter the number of rows:");
		int rows = input.nextInt();
		int N = 1;
		
		// print header
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		
		while(N <= rows) {
			// print table contents
			System.out.printf("%d\t%d\t%d\t%d\n", N, 10*N, 100*N, 1000*N);
			N++;
		}
		

	}

}
