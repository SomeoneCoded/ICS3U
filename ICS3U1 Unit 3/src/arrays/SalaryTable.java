/* Name: Dailiang Chen
 * Date: April 12, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program that organizes the salesmen earnings in a table
 * Major skills: Methods, Arrays
 */

// import scanner
package arrays;

import java.util.Scanner;
// class
public class SalaryTable {
	
	// static variables
	static int [] salaryArray = new int[11];
	static Scanner input = new Scanner(System.in);
	
	// main method
	public static void main(String[] args) {
		// 1. get number of salesmen
		int salesmen = getNumberOfSalesmen();
		// 2. get each salemen's earnings and sort them in a table
		earnings(salesmen);
		// 3. display the salaries in a table
		displaySalaries(salaryArray);

	}
	
	// get the number of salesmen
	private static int getNumberOfSalesmen() {
		System.out.print("How many salesmen do you have?: ");
		return input.nextInt();
	}
	
	// get the earnings of each salesmen and sort it
	private static void earnings(int salesmen) {
		for(int person = 1; person <= salesmen; person++) {
			System.out.print("Enter the salesman sales: ");
			double sales = input.nextDouble();
			// calculate earnings
			double income = (int) (200 + 0.09 * sales);
			// sort the earnings
			if(income / 100 >= 10) salaryArray[10]++; // for income 1000+
			else
				salaryArray[(int) income/ 100]++;
		}
		
	}
	
	// display the earnings in a table
	private static void displaySalaries(int[] table) {
		int minCounter = 0; // minimum range
		int maxCounter = 99; // maximum range
		System.out.println("Earnings\tNo. of Salesmen\n___________________________");
		for(int element : table) { // go through each row
			if(minCounter == 0) {
				System.out.printf("$0-$100\t\t%d\n", element);
			}
			else if(minCounter == 1000)
				System.out.printf("$1000+\t\t%d", element);
			else
				System.out.printf("$%d-$%d\t%d\n", minCounter, maxCounter, element);
			
			minCounter+=100;
			maxCounter+=100;
			
		}
		
	}

}
