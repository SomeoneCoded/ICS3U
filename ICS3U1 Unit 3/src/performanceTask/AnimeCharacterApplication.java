package performanceTask;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class AnimeCharacterApplication {

	private static AnimeCharacter[] animeCharacterArray; // object array
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		fillLibrary();
		showTitle();
		showLibrary();
		int answer = getFavourite();
		showAnimeCharacter(answer);

	}

	private static void fillLibrary() {
		System.out.print("How many anime characters do you want to input?: ");
		int size = input.nextInt();
		animeCharacterArray = new AnimeCharacter[size];

		for (int idx = 0; idx < animeCharacterArray.length; idx++) {
			System.out.printf("Anime %d\n", idx + 1);

			System.out.print("Enter your anime character name: ");
			String characterName = input.next();
			System.out.print("Enter the series: ");
			String seriesName = input.next();
			System.out.print("Enter the year of its first appearence: ");
			int firstAppearence = input.nextInt();
			System.out.println();

			animeCharacterArray[idx] = new AnimeCharacter(characterName, seriesName, firstAppearence);

		}
	}

	private static void showTitle() {
		System.out.print("Anime Character Library\r\n" + "=======================\r\n" + "");

	}

	private static void showLibrary() {
		Arrays.sort(animeCharacterArray, Comparator.comparing(AnimeCharacter::getName)); // sort the array by a getter
		for (int idx = 0; idx < animeCharacterArray.length; idx++) {
			System.out.print(idx + 1 + ". ");
			System.out.println(animeCharacterArray[idx].toString());
		}

	}

	private static int getFavourite() {
		System.out.print("Who's your favourite anime character? ");
		int answer = 0;
		do {
			System.out.print("What number is your favourite anime? ");
			answer = input.nextInt();
			if (answer < 1 || answer > animeCharacterArray.length)
				System.out.println("Invalid value. Try again.");

		} while (answer < 1 || answer > animeCharacterArray.length);

		return answer - 1;

	}

	private static void showAnimeCharacter(int index) {
		System.out.printf("Your favourite character is %s from %s and their first appearance was in %d.\r\n",
				animeCharacterArray[index].getName(), animeCharacterArray[index].getSeries(),
				animeCharacterArray[index].getFirstAppearence());

	}

}
