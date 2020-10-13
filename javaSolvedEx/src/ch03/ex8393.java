package ch03;

import java.util.Scanner;

public class ex8393 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		if (a%2==1) {
			System.out.println((a+1)*((a-1)/2)+(a+1)/2);
			
		} else {
			System.out.println((a+1)*a/2);
		}
	}
}
