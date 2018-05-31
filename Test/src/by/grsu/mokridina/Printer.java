package by.grsu.mokridina;

public class Printer {

	public static void print(String s) {
		System.out.println(s);
	}

	public static void print(int n) {
		System.out.println(n);
	}

	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			print(arr[i]);
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			print(arr[i]);
		}
	}
}
