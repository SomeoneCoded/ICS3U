/* Name: Dailiang Chen
 * Date: April 16, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that creates a sales table
 * Major skills: Methods, Arrays
 */

// implement scanner
package arrays;

import java.util.Scanner;

// class
public class SalesTable {

	// salesTableArray
	static double[][] salesTableArray = new double[6][7];

	// main method
	public static void main(String[] args) {

		// 1. enter the slips
		getSales();

		// 2. calculate the total value
		calculateTotal();

		// 3. display the table
		displayTable(salesTableArray);

	}

	// get sales method
	private static void getSales() {
		// implement scanner
		Scanner input = new Scanner(System.in);
		// store string variable
		String more;

		// ask for the input
		do {
			// ask for the salesperson's number
			System.out.print("Enter the salesperson number: ");
			int salespersonNumber = input.nextInt();
			// ask for the product number
			System.out.print("Enter the product number: ");
			int productNumber = input.nextInt();
			// ask for the sales of the product number
			System.out.print("Enter the total value of the product: ");

			// import the values to the table
			double value = input.nextDouble();
			salesTableArray[salespersonNumber][productNumber] = value;

			// ask are there more users
			System.out.print("Are there more slips? (Y/N)");
			more = input.next();
		} while (more.toUpperCase().equals("Y"));

	}

	// calculate the total value
	private static void calculateTotal() {
		// get sales person revenue
		for (int totalSalesPersonSales = 1; totalSalesPersonSales <= 4; totalSalesPersonSales++) {
			for (int productSale = 1; productSale <= 5; productSale++)
				salesTableArray[totalSalesPersonSales][6] += salesTableArray[totalSalesPersonSales][productSale];

		}

		// get product revenue
		for (int productSales = 1; productSales <= 5; productSales++) {
			for (int salesperson = 1; salesperson <= 4; salesperson++)
				salesTableArray[5][productSales] += salesTableArray[salesperson][productSales];
		}

	}

	// display method
	private static void displayTable(double[][] table) {
		// title
		System.out.println("\n\t\t\t\t\tTable of Sales ($)");

		// product heading
		System.out.print("\t\t");
		for (int number = 1; number <= 5; number++) {
			System.out.printf("Product %d\t", number);
		}
		System.out.println("Total\t");

		// Make the Table
		for (int salesperson = 1; salesperson <= 4; salesperson++) {
			System.out.printf("Salesperson %d\t", salesperson); // salesperson number

			for (int productValue = 1; productValue <= 6; productValue++) {
				// product value
				System.out.printf("%.2f\t\t", salesTableArray[salesperson][productValue]);
			}
			// new row
			System.out.println();
		}
		// total product value
		System.out.print("Total\t\t");
		for (int productTotal = 1; productTotal <= 5; productTotal++) {
			System.out.printf("%.2f\t\t", salesTableArray[5][productTotal]);
		}

	}

}
