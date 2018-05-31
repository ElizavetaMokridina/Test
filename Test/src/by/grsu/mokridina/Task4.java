package by.grsu.mokridina;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static String[] split(String s) {
		return s.split("\\s*\\,\\s*|\\s+");
	}

	public static void sort(String[] arr) {
		Arrays.sort(arr);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Printer.print("enter your string: ");
		String s = scanner.nextLine();

		String[] arr = split(s.toLowerCase());
		sort(arr);
		Printer.print("number of words = " + arr.length);
		Printer.printArray(arr);

		scanner.close();
	}
}
