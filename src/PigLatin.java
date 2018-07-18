
//benjamin.mcbrayer, 4.27.2018
//This Java console program translates text to Pig Latin.

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		StringBuilder way = new StringBuilder("way");
		StringBuilder ay = new StringBuilder("ay");
		String beforeVowel = "";
		final String vowels = "AEIOUaeiou";
		// final String numbersAndSymbols = "1234567890`~@#$%^&*()-=_+<>/";
		String username = null;
		String userString;
		// String userStringTranslate = "";
		String playAgain = null;
		String[] words;
		int i = 0;

		System.out.println("Welcome to the Pig Latin Translator!");

		// Greet user.
		username = Validator.getString(scnr, "Please enter your name: ");
		System.out.println("Hello, " + username + "!");

		do {
			// Prompt user to enter a word.
			userString = Validator.getString(scnr,
					"Please enter a word, phrase, clause, or sentence to be translated: ");

			// Verify that user has entered text.
			if (userString.length() != 0) {

				// Make the application take a line of text.
				// FIX ME: Make the program put the suffix before any punctuation (instead of
				// after it).
				words = userString.split(" ");
				// System.out.println(Arrays.toString(words));
				for (String word : words) {
					if (!vowels.contains("" + word.charAt(0))) {
						// Determine whether words start with a vowel or a consonant and translate to
						// Pig Latin.
						beforeVowel = "";
						i = 0;
						do {
							beforeVowel += word.charAt(i);
							++i;
						} while (i < word.length() && !vowels.contains("" + word.charAt(i)));
						// System.out.println(beforeVowel);
						System.out.print(word.substring(i) + beforeVowel + ay + " ");
					}
					if (vowels.contains("" + word.charAt(0))) {
						word = word + way;
						System.out.print(word + " ");
					}
				}

			} else {
				System.out.println("You failed to enter any text.");
			}

			// Ask if the user wants to continue.
			System.out.println();
			playAgain = Validator.getString(scnr, "Would you like to continue (y/n)? ");

		} while (playAgain.equalsIgnoreCase("y"));

		// Bid the user adieu.
		System.out.println("Goodbye!");

		scnr.close();

	}
}