
//Benjamin McBrayer, 4.27.2018
//This Java console program translates text to Pig Latin.

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		StringBuilder way = new StringBuilder("way");
		StringBuilder ay = new StringBuilder("ay");
		char c;
		int i;
		String vowels = "AEIOUaeiou";
		String numbersAndSymbols = "1234567890`~@#$%^&*()-=_+<>/";
		String userString = null;
		String UserStringTranslate = null;
		String userName = null;
		String playAgain = null;

		System.out.println("Welcome to the Pig Latin Translator!");

		// Ask for user information.
		System.out.print("Please enter your name: ");
		userName = scnr.next();
		System.out.println(sayHelloName(userName));
		scnr.nextLine();

		do {
			// Prompt user to enter a word.
			System.out.println("Please enter a word to be translated: ");
			userString = scnr.nextLine();

			if (userString.length() != 0) {
				// Determine whether a word starts with a vowel or a consonant and translate to
				// Pig Latin.
				c = userString.charAt(0);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' | c == 'A' || c == 'E' || c == 'I'
						|| c == 'O' || c == 'U') {
					UserStringTranslate = userString + way;
					System.out.println(UserStringTranslate);
				} else {
					for (i = 0; i < userString.length(); ++i) {
						if (vowels.contains("" + userString.charAt(i))) {
							UserStringTranslate = userString.substring(i) + userString.substring(0, i) + ay;
							System.out.println(UserStringTranslate);
							break;
						} else if (numbersAndSymbols.contains("" + userString.charAt(i))) {
							System.out.println(userString);
							break;
						}
					}
				}
			}
			else {
				System.out.println("You failed to enter any text.");
			}
			// Ask if the user wants to continue.
			System.out.println();
			System.out.print(contUser(userName));
			playAgain = scnr.next();
			scnr.nextLine();

		} while (playAgain.equalsIgnoreCase("y"));

		// Bid the user adieu.
		System.out.println(sayGoodbyeName(userName));

		scnr.close();

	}

	// Methods for communicating with the user.
	public static String sayHelloName(String userName) {
		return "Hello, " + userName + "!";
	}

	public static String contUser(String userName) {
		return userName + ", would you like to continue (y/n)? ";
	}

	public static String sayGoodbyeName(String userName) {
		return "Goodbye, " + userName + "!";
	}
}