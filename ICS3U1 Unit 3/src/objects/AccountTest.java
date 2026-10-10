package objects;

// import scanner
import java.util.Scanner;

// class
public class AccountTest {
	
	// static variables
	static Scanner input = new Scanner(System.in);
	static Account account1 = new Account(0.00);
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		
		// account amount
		System.out.print("Enter your account balance: ");
		double balance = input.nextDouble();
		
		// Create account object
		account1.setBalance(balance);
		
		// ask for deposit or withdraw
		System.out.print("Do you want to deposit or withdraw? ");
		String option = input.next();
		if(option.toLowerCase().equals("deposit")) //deposit
			deposit();
		else if(option.toLowerCase().equals("withdraw")) //withdraw
			withdraw();
		else
			System.out.print("Invalid option"); // invalid option
		
	}
	
	// methods
	// deposit method
	private static void deposit() {
		System.out.print("Enter the amount you want to deposit: ");
		double depositAmount = input.nextDouble(); // get amount
		if(depositAmount <= 0) // invalid deposit
			System.out.printf("Invalid amount! Your account balance is $%.2f", account1.getBalance());
		else {
			account1.credit(depositAmount);
			System.out.printf("Your account balance is $%.2f", account1.getBalance());
		}
		
		
	}
	
	// withdraw method
	private static void withdraw() {
		System.out.print("Enter the amount you want to withdraw: ");
		double withdrawAmount = input.nextDouble(); // get amount
		if(account1.getBalance() - withdrawAmount < 0) // exceeded limit
			System.out.printf("You exceeded your withdraw amount! Your account balance is $%.2f", account1.getBalance());
		else {
			account1.debit(withdrawAmount);
			System.out.printf("Your account balance is $%.2f", account1.getBalance());
		}
		
	}

}
