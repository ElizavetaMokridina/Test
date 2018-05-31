package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task10 {

	public static void makePermutations(int[] arr) {
		for (int i = 0; i < 3; i++) {
			if (arr[i] != 0) {
				Printer.print(arr[i] * 100 + arr[(i + 1) % 3] * 10 + arr[(i + 2) % 3]);
				Printer.print(arr[i] * 100 + arr[(i + 2) % 3] * 10 + arr[(i + 1) % 3]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				Printer.print("enter digit = ");
				arr[i] = scanner.nextInt();
			}

			makePermutations(arr);

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}
