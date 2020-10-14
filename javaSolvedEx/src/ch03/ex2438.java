package ch03;

import java.util.Scanner;

public class ex2438 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int i = 0;
		int j = 0;
		while (i<a) {
			if (i <j+1) {
				System.out.print("*");
				i = i + 1;
			} else {
				System.out.printf("%n");
				j = j + 1;
				i = 0 ;
			}
		}
	}
}
