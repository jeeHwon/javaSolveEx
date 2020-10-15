package ch04;

import java.util.Scanner;

public class ex10952 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		while (a*b!=0) {
			System.out.println(a+b);
			a = num.nextInt();
			b = num.nextInt();
		}
	}
}