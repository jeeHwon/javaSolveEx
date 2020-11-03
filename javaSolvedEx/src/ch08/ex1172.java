package ch08;

import java.util.Scanner;

public class ex1172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String temp = sc.nextLine();
		String[] array = temp.split("");
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += Integer.parseInt(array[i]);
		}
		System.out.println(result);
	}
}
