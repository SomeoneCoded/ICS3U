package performanceTask;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class BookApplication {

	private static Book [] bookArray = new Book[5];
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		fillLibrary();
		System.out.println("Welcome to the Library");
		String option;
		
		do {
			System.out.println("What would you like to do now? (Menu/Library/Book/Title/Cost/Clear/Quit)");
			option = input.next();
			if(option.toLowerCase().equals("menu"))
				showMenu();
			else if(option.toLowerCase().equals("library"))
				showLibrary();
			else if(option.toLowerCase().equals("book"))
				showBook();
			else if(option.toLowerCase().equals("title"))
				showLibraryByTitle(bookArray);
			else if(option.toLowerCase().equals("cost"))
				showLibraryByCost(bookArray);
			else if(option.toLowerCase().equals("clear"))
				clearConsole();
			else if (option.toLowerCase().equals("quit")) {
				System.out.println("Have a great day!");
				break;
			}
			else
				System.out.println("Invalid input. Try again!");
		} while(option.toLowerCase() != "quit");
		

	}

	private static void fillLibrary() {
		bookArray[0] = new Book("In Search of Lost Time Volume I Swann's Way","Marcel Proust",656, 1998, "9780375751540",21.60);
		bookArray[1] = new Book("Atomic Habits","James Clear",320, 2018, "9780735211292",23.25);
		bookArray[2] = new Book("The Lost Bookshop","Evie Woods",448, 2023, "9780008646042",17.49);
		bookArray[3] = new Book("The Housemaid","Freida McFadden",336, 2022, "9781538742570",14.54);
		bookArray[4] = new Book("It Ends with Us","Coleen Hoover",384, 2016, "9781501110368",29.60);
	}

	private static void showMenu() {
		System.out.println("LIBRARY\n===========");
		for (int idx = 0; idx < bookArray.length; idx++) {
			System.out.println(idx + 1 + ". " + bookArray[idx].toString());
		}

		int index;
		do {
			System.out.println("Enter a valid book you want to take out using the index");
			index = input.nextInt();
		} while (index < 1 || index > 5);

		System.out.println(bookArray[index-1]);
	}

	private static void showLibrary() {
		System.out.println("LIBRARY\n===========");
		for (int idx = 0; idx < bookArray.length; idx++) {
			System.out.println(bookArray[idx]);
		}

	}

	private static void showBook() {
		System.out.print("Enter a keyword for a title: ");
		String keyword = input.next();
		for (int idx = 0; idx < bookArray.length; idx++) {
			if (bookArray[idx].getTitle().toLowerCase().contains(keyword.toLowerCase()))
				System.out.println(bookArray[idx]);
		}

	}

	private static void showLibraryByTitle(Book [] bookArrayByTitle) {
		System.out.println("LIBRARY\n===========");
		Arrays.sort(bookArrayByTitle, Comparator.comparing(Book::getTitle));
		for(int idx = 0; idx < bookArrayByTitle.length; idx++) {
			System.out.println(bookArrayByTitle[idx]);
		}
		
	}

	private static void showLibraryByCost(Book [] bookArrayByCost) {
		System.out.println("LIBRARY\n===========");
		Arrays.sort(bookArrayByCost, Comparator.comparing(Book::getCost));
		for(int idx = 0; idx < bookArrayByCost.length; idx++) {
			System.out.println(bookArrayByCost[idx]);
		}
		
	}

	private static void clearConsole() {
		for(int row = 1; row <= 50; row++)
			System.out.println();

	}


}
