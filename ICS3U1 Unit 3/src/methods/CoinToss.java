/* Name: Dailiang Chen
 * Date: April 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that simulates a coin toss
 * Major skills: Main methods
 */

// import scanner
package methods;

import java.util.Scanner;

// class
public class CoinToss {
	
	// global variables
	static Scanner input = new Scanner(System.in);
	static int heads = 0, tails = 0;
	
	// main method
	public static void main(String[] args) {
		
		// simulate coin toss
		while(true) {
			System.out.print("Do you want to toss a coin? (Y/N) ");
			String tossCoin = input.next().toUpperCase();
			// ask for another toss
			if(tossCoin.equals("N"))
				break;
			else
				TossCoin();
				
		}
		
		// display the results
		displayResult(heads, tails);

	}
	
	// coin toss method
	private static void TossCoin() {
		double coin = Math.random();
		if(coin < 0.5) {
			System.out.println("You got heads!");
			heads++;
		} else {
			System.out.println("You got tails!");
			tails++;
		}
			
	}
	
	private static void displayResult(int heads, int tails) {
		System.out.printf("Heads: %d \nTails: %d", heads, tails);
		
	}

}
