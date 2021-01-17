package ch13;

import java.util.Scanner;

public class ex15649 {
	static int n, m;//4 3
	static int list[], check[]; 
	static int max = 9;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//4
		m = sc.nextInt();//3
		list = new int[max];	
		check = new int[max];	
		func(0);

	} 
	public static void func(int cnt) {	// 반복 횟수를 파라미터로 초기 0으로 설정
		if(cnt == m) {					// 0부터 m까지 반복하면 한 사이클 ok
			for (int i = 0; i < m; i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println("");
			return;
		}
		for (int i = 1; i <= n; i++) {	// 1부터 n이 될때까지
			if (check[i]==1) continue;	// 이미 체크한 부분이면 스킵
			check[i] = 1;				// 체크 안했다면 체크 처리 후
			list[cnt] = i;				// 현재 반복횟수 위치에 i 지정 
			func(cnt+1);				// 반복횟수 증가
			check[i] = 0;				// 함수 종료 후 체크 초기화
			
		}
	}
}

