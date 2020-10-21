package ch06;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1065 {
	public static void main(String[] args) {
		//468 531 751
		//110
		// 1 2 3 4 5 6 7 8 9 = 9
		// 1 ~ 99 = 99
		//100 101 102 103 104 105 106 107 108 109 110
		//789 757
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		for (int i = 1; i < 100; i++) {
			arr.add(i);
		}
		int n = sc.nextInt();
		
		if (n<100) {
			System.out.println(n);
		}else {
			for (int i = 100; i <= n; i++) {
				int a = i/100;
				int b = i/10%10;
				int c = i%10;
				if (b-a==c-b) {
					arr.add(i);
				}
				
			}
			System.out.println(arr.size());
			
		}
		
		
		
	}
	
}
