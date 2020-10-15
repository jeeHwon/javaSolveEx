package ch05;

import java.util.Scanner;

public class ex2577 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int result = a*b*c;
		int j = 0;
		int len = Integer.toString(result).length();
		int[] arr = new int[len];
		while (result!=0) {
			arr[j] = result % 10;
			result = result / 10;
			j++;
		}
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (i==arr[k]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}