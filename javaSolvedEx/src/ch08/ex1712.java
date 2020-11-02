package ch08;

import java.util.Scanner;

public class ex1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double d = (double)a/(double)(c-b);
		
		if (b>=c) {
			System.out.println(-1);
		}else {
			System.out.println((int)d+1);
		}
	}
}
