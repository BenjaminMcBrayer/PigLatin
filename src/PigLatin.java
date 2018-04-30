
//Benjamin McBrayer, 4.27.2018
//This Java console program translates text to Pig Latin.

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		StringBuilder way = new StringBuilder("way");
		StringBuilder ay = new StringBuilder("ay");
		String vowels = "AEIOUaeiou";
		String numbersAndSymbols = "1234567890`~@#$%^&*()-=_+<>/";
		String userString;
		String userStringTranslate = "";
		String userName = "";
		String playAgain = null;
		String[] words;
		int i;

		System.out.println("Welcome to the Pig Latin Translator!");

		// Ask for user information.
		System.out.println(getUserNameAndSayHello(userName));

		do {
			// Prompt user to enter a word.
			System.out.println("Please enter a word, phrase, clause, or sentence to be translated: ");
			userString = scnr.nextLine();

			// Verify that user has entered text.
			if (userString.length() != 0) {

				// Make the application take a line of text.
				//FIX ME: Make the program put the suffix before any punctuation (instead of after it).
				words = userString.split(" ");
				for (String word : words) {
					// Determine whether words start with a vowel or a consonant and translate to
					// Pig Latin.
					if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
							|| word.startsWith("u") | word.startsWith("A") || word.startsWith("E")
							|| word.startsWith("I") || word.startsWith("O") || word.startsWith("U")) {
						userStringTranslate = word + way;
						System.out.print(userStringTranslate + " ");
					} else {
						for (i = 0; i < word.length(); ++i) {
							if (vowels.contains("" + word.charAt(i))) {
								userStringTranslate = word.substring(i) + word.substring(0, i) + ay;
								System.out.print(userStringTranslate + " ");
								break;
							} else if (numbersAndSymbols.contains("" + word.charAt(i))) {
								System.out.println(words);
								break;
							}
						}
					}
				}
			} else {
				System.out.println("You failed to enter any text.");
			}
			// Ask if the user wants to continue.
			System.out.println();
			System.out.println("Would you like to continue (y/n)?");
			playAgain = scnr.next();
			scnr.nextLine();

		} while (playAgain.equalsIgnoreCase("y"));

		// Bid the user adieu.
		System.out.println("Goodbye!");

		scnr.close();

	}

	// Method for communicating with the user.
	public static String getUserNameAndSayHello(String userName) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		userName = scnr.nextLine();
		return "Hello, " + userName + "!";
	}
}