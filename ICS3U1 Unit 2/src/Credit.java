/* Name: Dailiang Chen
 * Date: Mar 6, 2024
 * Course: ICS3U1 - Mr. Fernandes
 * Description: Write a program to check someonbe's credit
 * Major skills: Math, Algorithm, While Loops
 */

// import scanner
import java.util.Scanner;

public class Credit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String programExit = "";
		do {
			System.out.print("Enter account number: ");
			String accountNumber = input.next();
			System.out.print("Enter the balance at the beginning of the month: ");
			int initialBalance = input.nextInt();
			System.out.print("Enter the total items charged: ");
			int charges = input.nextInt();
			System.out.print("Enter the amount of credits applied: ");
			int credits = input.nextInt();
			System.out.print("Enter the credit limit: ");
			int creditLimit = input.nextInt();
			// Calculate
			int newBalance = initialBalance + charges - credits;
			if(newBalance > creditLimit) {
				System.out.println("Credit limit exceeded.");
			} else {
				System.out.println("No issues found.");
			}
			System.out.print("Do you want to quit? Type 'QUIT' to quit or 'CONTINUE' to continue: ");
			programExit = input.next();
			
		} while (!programExit.equalsIgnoreCase("QUIT"));
	}

}
