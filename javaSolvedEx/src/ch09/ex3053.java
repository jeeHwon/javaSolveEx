package ch09;

import java.util.Scanner;

public class ex3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double ucli = Math.PI * r * r;
		double taxi = r * r * 2;
		System.out.println(ucli);
		System.out.println(taxi);
	}
}
