package ch05;

import java.util.Scanner;

public class ex2562 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];
		int[] copy = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		for (int i = 0; i < copy.length-1; i++) {
			if (copy[i]>copy[i+1]) {
				copy[i+1] = copy[i];
			}
		}
		int result = 0;
		for (int i = 0; i < copy.length; i++) {
			if (arr[i] == copy[8]) {
				result = i;
			}
		}
		System.out.println(copy[8]);
		System.out.println(result+1);
		}
}