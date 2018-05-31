package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task9 {

	public static int findSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i += 2) {
			Printer.print(i);
			sum += i;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Printer.print("enter N: ");
			int n = scanner.nextInt();

			Printer.print(findSum(n));

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}