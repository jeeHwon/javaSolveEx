package ch09;

import java.util.Scanner;

public class ex4948 {

	public static void main(String[] args) {
		Boolean isEnd = false;
		Scanner sc = new Scanner(System.in);
		while(!isEnd) {
			int q = sc.nextInt();
			if (q==0) {
				isEnd = true;
				break;
			}
			int count = 0;
			for (int i = q; i <= q*2; i++) {
				if (isPrime(i)) {
					count++;
				}
			}
			System.out.println(count);
			
		}

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
