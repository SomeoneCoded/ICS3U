/* Name: Dailiang Chen
 * Date: Mar 27, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to check sales
 * Major skills: Math, Algorithm, Switch statement, break statement, continue statement
 */

// import scanner
import java.util.Scanner;

// class
public class Sales2 {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// store the total value
		double totalValue = 0;
		// go through the user input
		for (int product = 1; product <= 5; product++) {
			// ask the user how many products they have sold
			System.out.printf("Enter the quantity of product %d that was sold: ", product);
			int quantity = input.nextInt();
			
			// cases for each product number
			switch (product) {
			case 1: // product 1
				totalValue += (double) quantity * 2.98; // price of product 1
				break;
			case 2: // product 2
				totalValue += (double) quantity * 4.50; // price of product 2
				break;
			case 3: // product 3
				totalValue += (double) quantity * 9.98; // price of product 3
				break;
			case 4: // product 4
				totalValue += (double) quantity * 4.49; // price of product 4
				break;
			case 5: // product 5
				totalValue += (double) quantity * 6.87; // price of product 5
				break;
			default: // default option
				continue; // continue through the loop
			}

		}
		
		// output the total value
		System.out.printf("The total value of products sold is $%,.2f", totalValue);

	}

}
