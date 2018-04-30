import java.util.Scanner;

public class booleanMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean firstCharIsVowel (char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}
	}
	
	public static String getUserNameAndSayHello(String userName) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		userName = scnr.nextLine();
		return "Hello, " + userName + "!";
	}
	
	public static String contUser(String userName) {
		Scanner scnr = new Scanner(System.in);
		return userName + ", would you like to continue (y/n)? ";
	}

}
