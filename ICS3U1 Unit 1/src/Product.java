
//Name: Dailiang Chen
//Date: February 12, 2024
//Course: ICS3U1-04 - Mr.Fernandes
//Description: Write an application that calculates and prints the product of three integers.
import java.util.*;

public class Product {
	public static void main(String[] args) {

		// implement scanner
		Scanner sc = new Scanner(System.in);

		// input first number
		System.out.print("Input first number: ");
		int first = sc.nextInt();
		// input second number
		System.out.print("\nInput second number: ");
		int second = sc.nextInt();
		// input third number
		System.out.print("\nInput third number: ");
		int third = sc.nextInt();

		// output product
		System.out.println(first + " * " + second + " * " + third + " = " + first * second * third);
	}
}
