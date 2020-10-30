package ch08;

import java.util.Scanner;

public class ex2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int m = n/5;
		boolean status = true;
		for (int i = m; i >-1 ; i--) {
			if ((n-(5*i))%3==0) {
				System.out.println((n-(5*i))/3+i);
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println(-1);
		}
	}
}
