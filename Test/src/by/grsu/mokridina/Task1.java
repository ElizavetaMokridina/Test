package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static String checkParity(int n) {
		if (n % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

	public static String checkPrimality(int n) {
		if (n < 2) {
			return "The number is not prime or composite ";
		}
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0) {
				return "composite";
			}
		return "prime";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Printer.print("enter your number: ");
			int n = scanner.nextInt();

			Printer.print(checkParity(n));
			Printer.print(checkPrimality(n));

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}
