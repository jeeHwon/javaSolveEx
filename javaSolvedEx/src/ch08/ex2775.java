package ch08;

import java.util.Scanner;

public class ex2775 {
	public static void main(String[] args) {
		//testCase : 케이스 수
		// k : 몇 층 2 
		// n : 몇 호 3
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		
		for (int i = 0; i < testCase; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[n][k];
			for (int j = 0; j < k; j++) {
				arr[0][j] = j+1;
			}
			for (int j = 1; j < k; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					int hap = 0;
					for (int l = 0; l < j2+1; l++) {
						hap = hap + arr[j-1][l];
					}
					arr[j][j2] = hap;
				}
			}
			System.out.println(arr[n-1][k-1]);
		}
		
		
	}
}
