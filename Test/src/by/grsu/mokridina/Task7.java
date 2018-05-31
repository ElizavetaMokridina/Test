package by.grsu.mokridina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

	public static void generateArray(int[] arr) {
		int a = 10;
		int b = 100;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a + (int) (Math.random() * (b - a));
		}
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			Printer.print("enter N: ");
			int n = scanner.nextInt();

			int[] array = new int[n];
			generateArray(array);
			Printer.printArray(array);
			Printer.print("max = " + findMax(array));
			Printer.print("min = " + findMin(array));

		} catch (InputMismatchException e) {
			Printer.print("invalid input");
		} catch (Exception e) {
			Printer.print("something went wrong");
		} finally {
			scanner.close();
		}
	}
}
