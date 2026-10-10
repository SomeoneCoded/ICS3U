
// Name: Dailiang Chen
// Date: February 12, 2024
// Course: ICS3U1-04 - Mr.Fernandes
// Description: Write an application that reads five integers and determines and prints the largest and smallest integers in the group.  

// import all utilities
import java.util.*;

// Make class called LargeSmall
public class LargeSmall {

	// make main method
	public static void main(String[] args) {

		// Implement Scanner
		Scanner sc = new Scanner(System.in);

		// Implement array to store values
		int[] arr = new int[5];

		// Input values to array
		for (int i = 0; i < 5; i++) {
			System.out.printf("Enter number %d: ", i + 1);
			arr[i] = sc.nextInt();
		}

		// Sort values in ascending order
		Arrays.sort(arr);

		// Print smallest and largest values
		System.out.printf("\nSmallest number is %d\nLargest number is %d", arr[0], arr[4]);
	}

}
