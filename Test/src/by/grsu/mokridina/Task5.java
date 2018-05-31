package by.grsu.mokridina;

import java.util.Scanner;

public class Task5 {

	public static int countWord(String string, String word) {
		int counter = 0;
		int index = -1;
		do {
			index = string.indexOf(word, index + 1);
			String begin;
			String end;

			if (index - 1 < 0) {
				begin = " ";
			} else {
				begin = String.valueOf(string.charAt(index - 1));
			}

			if (index + word.length() == string.length()) {
				end = " ";
			} else {
				end = String.valueOf(string.charAt(index + word.length()));
			}

			if (index >= 0 && (begin.matches("\\W")) && (end.matches("\\W"))) {
				counter++;
				index += word.length();
			}
		} while (index >= 0);
		return counter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Printer.print("enter your string: ");
		String string = scanner.nextLine();
		Printer.print("enter your word: ");
		String word = scanner.nextLine();

		Printer.print(countWord(string.toLowerCase(), word.toLowerCase()));

		scanner.close();
	}
}
