package ch10;

import java.util.Scanner;

public class ex10872 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	static int factorial(int x) {
		if(x==0) {
			return 1;
		} else {
			return x * factorial(x-1);
		}
	}
}

