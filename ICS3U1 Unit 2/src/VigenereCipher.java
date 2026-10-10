import java.util.*;

// https://www.geeksforgeeks.org/vigenere-cipher/
public class VigenereCipher {
	static char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter your text: ");
			String text = input.next().toLowerCase();
			System.out.print("Enter your code: ");
			String code = input.next().toLowerCase();
			System.out.print("Do you want to encrypt or decrpyt text?: ");
			String option = input.next().toLowerCase();

			while (option.equals("encrypt") || option.equals("decrypt")) {
				if (option.equals("encrypt")) { // encryption
					String answer = "";
					for (int i = 0, counter = 0; i < text.length(); i++, counter++) {
						if ((text.charAt(i) >= 97 && text.charAt(i) <= 122)
								&& (code.charAt(counter % code.length()) >= 97
										&& code.charAt(counter % code.length()) <= 122)) {
							answer += (char) alphabet[((text.charAt(i) - 97)
									+ (code.charAt(counter % code.length()) - 97)) % 26]; // answer(i) = (text(i) + code(i))%26
						}
					}

					System.out.println(answer.toUpperCase());
				} else if (option.equals("decrypt")) { // decryption
					String answer = "";
					for (int i = 0, counter = 0; i < text.length(); i++, counter++) {
						if ((text.charAt(i) >= 97 && text.charAt(i) <= 122)
								&& (code.charAt(counter % code.length()) >= 97
										&& code.charAt(counter % code.length()) <= 122)) {
							answer += (char) alphabet[(int) (((text.charAt(i) - 97) 
									- (code.charAt(counter % code.length()) - 97) + 26) % 26)]; // answer(i) = (text(i) - code(i))%26
						}
					}
					System.out.println(answer.toUpperCase());
				}
				System.out.println("Do you want to run the program again? (yes/no)");
				option = input.next().toLowerCase();
				if (option.equals("yes"))
					break;
				else {
					System.out.println("Program terminating...");
					return;
				}
			}
		}
	}
}
