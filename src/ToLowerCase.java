import java.util.Scanner;

public class ToLowerCase {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String userString = null; 
		
		System.out.println("Please enter words, phrases, or sentences to be translated: ");
		userString = scnr.nextLine();
		System.out.println(userString.toLowerCase());

	}

}
