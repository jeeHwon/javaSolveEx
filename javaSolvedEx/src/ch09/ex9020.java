package ch09;

import java.util.Scanner;

public class ex9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for (int i = 0; i < t; i++) {
//			
//		}
		int n = sc.nextInt();
		
		
	}
	
	static boolean isPrime(int m) {
		if (m==2) return true;
		if (m==1 || m%2==0) return false;
		for (int i = 3; i < m; i= i+2) {
			if (m%i==0) {
				return false;
			} 
		}
		return true;
	}
}
