package ch08;

import java.util.Scanner;

public class ex2869 {

	public static void main(String[] args) {
		//4 1 11 : 4(4 3 7 6 10 9 13)
		//2 1 2 : 1(2)
		//2 1 3 : 2(2 1 3)
		//2 1 4 : 3(2 1 3 2 4)
		//3 1 4 : 2(3 2 5) 0.5
		//3 1 5 : 2(3 2 5) 1.0
		//3 1 6 : 3(3 2 5 4 7) 1.5
		//3 1 7 : 3(3 2 5 4 7) 2.0
		//3 1 8 : 4(3 2 5 4 7 6 9 ) 2.5
		//3 1 9 : 4(3 2 5 4 7 6 9 ) 3.0
		//4 1 9 : 3(4 3 7 6 10) 1.6
		//4 1 10 :3(4 3 7 6 10) 2.0
		//4 1 11 :4(4 3 7 6 10 9 13) 2.3
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		double day = (v-a)*1.0/(a-b)*1.0;
		day = Math.ceil(day);
		System.out.println((int)day+1);		
		
		//시간초과 코드
//		int height = 0;
//		int count = 0;
//		while (true) {
//			height += a;
//			count++;
//			if (height>=v) {
//				break;
//			}
//			height -= b;
//		}
//		System.out.println(count);
	}
}
