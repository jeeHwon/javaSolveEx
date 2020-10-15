package ch03;

import java.util.Scanner;

public class ex10871 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int x = num.nextInt();
		for (int i = 0; i < n; i++) {
			int a = num.nextInt();
			if (a<x) {
				System.out.print(a);
				System.out.print(" ");
			}
		}
	}
}