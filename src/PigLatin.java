
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
		String vowels = "aeiou";
		String userString = null;
		String newUserString = null;
		String newUserStringTranslate = null;
		String userName = null;
		String playAgain = null;

		System.out.println("Welcome to the Pig Latin Translator!");

		// Ask for user information.
		System.out.print("Please enter your name: ");
		userName = scnr.next();
		System.out.println(sayHelloName(userName));
		scnr.nextLine();

		do {
			// Prompt user to enter a sentence.
			System.out.println("Please enter a word to be translated: ");
			userString = scnr.nextLine();

			// Convert input to lower case.
			newUserString = userString.toLowerCase();

			// Determine whether a word starts with a vowel or a consonant and translate to
			// Pig Latin.
			c = newUserString.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				newUserStringTranslate = newUserString + way;
				System.out.println(newUserStringTranslate);
			} else {
				for (i = 0; i < newUserString.length(); ++i) {
					if (vowels.contains("" + newUserString.charAt(i))) {
						newUserStringTranslate = newUserString.substring(i) + newUserString.substring(0, i) + ay;
						break;
					}
				}
				System.out.println(newUserStringTranslate);
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