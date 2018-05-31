package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

	public static String checkLines(double a, double b, double c) {
		if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
			return "possibly";
		}
		return "impossibly";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Printer.print("enter a: ");
			double a = scanner.nextDouble();
			Printer.print("enter b: ");
			double b = scanner.nextDouble();
			Printer.print("enter c: ");
			double c = scanner.nextDouble();

			Printer.print(checkLines(a, b, c));

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}
