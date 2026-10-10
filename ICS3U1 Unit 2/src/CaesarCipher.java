import java.util.*;

public class CaesarCipher {

	static char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; // 26 letters of the alphabet

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to encrypt or decrypt a message in Caesar Cipher? (encrypt/decrypt): ");
		String option = input.next().toLowerCase();
		while (true) {
			if (option.equals("encrypt")) { // encryption
				// Prompt input
				System.out.print("Enter a message to encrypt: ");
				String message = input.next().toLowerCase();
				System.out.print("How much do you want to shift?");
				int shift = input.nextInt() % 26;
				// Process
				String result = "";
				for (int i = 0; i < message.length(); i++) {
					if (message.charAt(i) >= 97 && message.charAt(i) <= 122) {
						if (message.charAt(i) + shift > 122) { // goes beyond 'z'
							char letter = (char) (message.charAt(i) + shift - 122 - 1 + 97);
							result += letter;
						} else if (message.charAt(i) + shift < 97) { // goes below 'a'
							char letter = (char) ((char) 122 - (97 - (message.charAt(i) + shift) - 1));
							result += letter;
						} else {
							char letter = (char) ((char) message.charAt(i) + shift);
							result += letter;

						}
					} else
						result += (char) message.charAt(i);
				}
				System.out.printf("\nYour encoded message is %s", result);
				System.out.print("\nDo you want to encrypt or decrypt a message in Caesar Cipher? (encrypt/decrypt): ");
				option = input.next().toLowerCase();

			} else if (option.equals("decrypt")) { // decryption
				// Prompt input
				System.out.print("Enter a message to decrypt: ");
				String message = input.next().toLowerCase();
				// Process
				for (int i = 0; i <= 25; i++) {
					String result = "";
					for (int j = 0; j < message.length(); j++) {
						if (message.charAt(j) >= 97 && message.charAt(j) <= 122) {
							if (message.charAt(j) - i > 122) { // goes beyond 'z'
								char letter = (char) (message.charAt(j) - i - 122 - 1 + 97);
								result += letter;
							} else if (message.charAt(j) - i < 97) { // goes below 'a'
								char letter = (char) ((char) 122 - (97 - (message.charAt(j) - i) - 1));
								result += letter;
							} else {
								char letter = (char) ((char) message.charAt(j) - i);
								result += letter;
							}
						} else
							result += (char) message.charAt(j);
					}
					System.out.printf("\n %d. Your possible decoded message is %s", i, result);

				}
				System.out.print("\n\nDo you want to encrypt or decrypt a message in Caesar Cipher? (encrypt/decrypt): ");
				option = input.next().toLowerCase();

			} else if (option.equals("quit")) { // quit
				System.out.println("Terminating...");
				return;

			} else { // invalid input
				System.out.println("Invalid input. Terminating immediately...");
				return;
			}

		}
	}

}
