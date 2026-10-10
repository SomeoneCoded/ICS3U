/* Name: Dailiang Chen
 * Date: Mar 27, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to approximate for PI
 * Major skills: Math, Algorithm, Switch statement, break statement, continue statement
 */


// import utilities
import java.util.*;

// class
public class PI {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		double PI = 0;
		
		// get user input
		System.out.print("How many terms do you want for the approximation of PI?: ");
		int termNumber = input.nextInt();
		
		// calculate the approximation
		for(int term = 1, denominator = 1; term <= termNumber; term++, denominator += 2) {
			switch(term%2) {
			case 0:
				PI -= (double)4/denominator; // negative
				break;
			case 1:
				PI += (double)4/denominator; // positive
				break;
			default: // default option is to continue
				continue;
			}
		}
		// output the approximation
		System.out.printf("The approximation of PI with %d term(s) is %.10f", termNumber, PI);
	}

}
