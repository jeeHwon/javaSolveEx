package ch09;

import java.util.Scanner;

public class ex1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (m==2 || m==3) {
				count++;
				continue;
			}
			if (m==1 || (m%2)==0) continue;
			for (int j = 3; j < m; j= j+2) {
				if (m % j==0) {
					break;
				}
				if (j==(m-2)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
