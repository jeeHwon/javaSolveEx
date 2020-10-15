package ch05;

import java.util.Scanner;

public class ex10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = -1000000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		int min = max;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print(min+" ");
		System.out.print(max);
	}
}

