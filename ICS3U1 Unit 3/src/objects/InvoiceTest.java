package objects;

// implement scanner
import java.util.Scanner;

// class
public class InvoiceTest {
	
	// main method
	public static void main(String[] args) {
		// implement scanner
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter the part number: ");
		String partNumber = input.next();
		System.out.print("Enter part description: ");
		String description = input.next();
		System.out.print("Enter the quantity of the item: ");
		int quantity = input.nextInt();
		System.out.print("Enter the price per item: ");
		double price = input.nextDouble();
		
		// object
		Invoice hardware1 = new Invoice(partNumber, description, quantity, price);
		
		// get invoice amount
		System.out.printf("Your invoice amount is $%.2f", hardware1.getInvoiceAmount(quantity, price));
	}

}
