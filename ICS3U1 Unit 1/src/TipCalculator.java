/* Name: Dailiang Chen
 * Date: Feb 22, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that calculates tips
 * Major skills: Math, IPO
 */

// import scanner
import java.util.Scanner;

// make class
public class TipCalculator {

	// make main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);

		// input tip percentage
		System.out.print("Enter the cost of the goods: ");
		double cost = input.nextDouble();
		System.out.print("Enter the tip percentage: ");
		double percent = input.nextDouble();
		
		// calculate the tipping amount
		double tip = percent/100 * cost;
		
		// output tipping amount
		System.out.printf("You will need to pay a tip of $%.2f", tip);
		
		
		
	}
}
