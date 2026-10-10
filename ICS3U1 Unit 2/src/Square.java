/* Name: Dailiang Chen
 * Date: Mar 7, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to create a square
 * Major skills: Math, Algorithm, While Loops
 */

// implement scanner
import java.util.Scanner;
// class
public class Square {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// prompt user input
		System.out.println("Enter the size of one side of the square:");
		int size = input.nextInt();
		
		// create structure
		int row = 1;
		while(row <= size) {
			// edges
			if(row == 1 || row == size) {
				int column = 1;
				while(column <= size) {
					System.out.print("* ");
					column++;
				}
			} else { // middle of the square
				int column = 1;
				while(column <= size) {
					if(column == 1 || column == size) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					column++;
				}
			}
			// new row
			row++;
			System.out.println();
		}
	}

}
