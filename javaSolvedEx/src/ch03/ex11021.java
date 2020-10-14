package ch03;

import java.util.Scanner;

public class ex11021 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		for (int i = 1; i < a+1 ; i++) {
			int b = num.nextInt();
			int c = num.nextInt();
			System.out.printf("Case #%d: %d%n", i, b+c);
		}

	}
}
