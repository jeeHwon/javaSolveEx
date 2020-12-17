package ch09;

import java.util.Scanner;

public class ex1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int min = Math.min(Math.min(x, w-x),Math.min(y, h-y));
		System.out.println(min);
	}
}
