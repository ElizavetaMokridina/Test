package by.grsu.mokridina;

import java.util.Scanner;

public class Task3 {

	public static String palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return "not a palindrome";
			}
		}
		return "palindrome";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Printer.print("enter your word: ");
		String s = scanner.nextLine();

		Printer.print(palindrome(s));

		scanner.close();
	}
}
