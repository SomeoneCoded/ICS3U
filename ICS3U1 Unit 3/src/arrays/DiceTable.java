/* Name: Dailiang Chen
 * Date: April 12, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that simulates a dice roll
 * Major skills: Methods, Arrays
 */

// import statements
package arrays;

import java.util.Random; // random method
import java.util.Scanner; // scanner method

// class
public class DiceTable {
	
	// global array
	static int[] diceTallyArray = new int[13];
	
	// main method
	public static void main(String[] args) {
		// 1. get number of rolls
		int rolls = getNumberOfRolls();
		// 2. simulate dice
		diceSimulator(rolls);
		// 3. display the outcome
		displayResult(diceTallyArray);
		
	}
	
	// get user input method
	private static int getNumberOfRolls() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many dice rolls do you want?: ");
		return input.nextInt();
	}
	
	// simulate dice roll
	private static void diceSimulator(int rolls) {
		Random rand = new Random();
		for(int turn = 1; turn <= rolls; turn++) {
			int dice1 = rand.nextInt(1, 7); // simulate 6-sided dice
			int dice2 = rand.nextInt(1, 7); // simulate 6-sided dice
			diceTallyArray[dice1 + dice2]++; // position++
		}
	}
	
	// make a table
	private static void displayResult(int[] table) {
		System.out.print("\nSum\tTimes\n___________________\n");
		int counter = 0;
		for(int sum : table) { // output the table (for every element of the table array)
			System.out.printf("%d\t%d\n", counter, sum);
			counter++;
		}
		
	}

}
