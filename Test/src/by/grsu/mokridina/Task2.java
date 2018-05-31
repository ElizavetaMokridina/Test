package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int difference(int a, int b) {
		return a - b;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return Math.abs(a * b) / gcd(a, b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Printer.print("enter first number: ");
			int a = scanner.nextInt();
			Printer.print("enter second number: ");
			int b = scanner.nextInt();

			Printer.print("sum = " + sum(a, b));
			Printer.print("difference = " + difference(a, b));
			Printer.print("gcd = " + gcd(a, b));
			Printer.print("lcm = " + lcm(a, b));

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}
