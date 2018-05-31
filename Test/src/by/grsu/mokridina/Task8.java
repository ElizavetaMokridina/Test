package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {

	public static Boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void findPalindrome(int n) {
		for (Integer i = 0; i <= n; i++) {
			if (palindrome(i.toString())) {
				Printer.print(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Printer.print("enter N: ");
			int n = scanner.nextInt();

			if (n > 100) {
				throw new InputMismatchException();
			}

			findPalindrome(n);

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}
