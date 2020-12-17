package ch09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();	
		int n = sc.nextInt();	
		List<Integer> list = new ArrayList<Integer>(); 
		for (int i=m; i <= n; i++ ) {	//m과 n 사이 소수 구해 list 추가
			if (i==2) {
				list.add(i);
				continue;
			}
			if (i==3) {
				list.add(i);
				continue;
			}
			if (i==1 || (i%2)==0) continue;
			for (int j = 3; j < i; j= j+2) {
				if (i % j==0) {
					break;
				}
				if (j==(i-2)) {
					list.add(i);
				}
			}
		}
		int hap = 0;
		int min = 10000;
		for(int i=0; i< list.size(); i++) {
			hap += list.get(i);
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		if (hap==0) {
			System.out.println(-1);
		}else {
			System.out.println(hap);
			System.out.println(min);
		}
	}
}
