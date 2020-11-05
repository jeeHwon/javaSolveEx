package ch08;

import java.util.Scanner;

public class ex2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for (int i = 0; i < testCase; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			//아파트 모양의 배열 생성
			int[][] arr = new int[k+1][n+1];
			//0층에 먼저 기본값 세팅해준다
			for (int j = 0; j < n; j++) {
				arr[0][j] = j+1;
			}
			//1층씩 올라가면서 각 배열에 이전 배열의 합을 더해 넣는다
			for (int j = 1; j < k+1; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					int hap = 0;
					for (int l = 0; l < j2+1; l++) {
						hap = hap + arr[j-1][l];
					}
					arr[j][j2] = hap;
				}
			}
			System.out.println(arr[k][n-1]);
		}
	}
}
