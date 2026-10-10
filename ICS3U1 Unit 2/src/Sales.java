/* Name: Dailiang Chen
 * Date: Mar 7, 2024
 * Course:ICS3U1 - Mr. Fernandes
 * Description: Write a program to check sales
 * Major skills: Math, Algorithm, While Loops
 */

import java.util.Scanner;
public class Sales {
	public static void main(String [] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// variable to get items
		String item = "";
		// variable to hold value
		double value = 0;
		
		// bottom tested loop
		do {
			System.out.println("Type in the item you sold, or type 'QUIT' to exit program.");
			item = input.next();
			if(item.equals("1")) {
				value+=239.99;
			} else if(item.equals("2")) {
				value+=129.75;
			} else if(item.equals("3")) {
				value+=99.95;
			} else if(item.equals("4")) {
				value+=350.89;
			} else if(item.equals("QUIT")) {
				break;
			}
			
		} while(!item.equalsIgnoreCase("QUIT"));
		
		// output
		System.out.printf("Your earnings last week was $%.2f", 200.00+value*0.09);
	}
}
