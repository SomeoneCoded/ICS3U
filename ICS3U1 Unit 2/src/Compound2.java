/* Name: Dailiang Chen
 * Date: Mar 25, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to output an investment at different interest rates
 * Major skills: Math, Algorithm, For Loops
 */

// import utilities
import java.util.*;

// class
public class Compound2 {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// amount
		double amount;
		// input principal amount
		System.out.print("Enter your principal amount: ");
		double principal = input.nextDouble();
		
		// Output different interest rates
		for (double rate = 0.05; rate <= 0.1; rate += 0.01) {
			System.out.printf("%s%20s", "Year", "Amount on deposit");
			System.out.printf(" (%.0f%%)", rate * 100);
			System.out.println();
			// year 1-10
			for (int year = 1; year <= 10; year++) {
				amount = principal * Math.pow(1.0 + rate, year);
				System.out.printf("%4d%,20.2f\n", year, amount);
			}
			System.out.println();
		}
	}

}
