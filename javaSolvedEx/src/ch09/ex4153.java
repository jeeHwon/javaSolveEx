package ch09;

import java.util.Scanner;

public class ex4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a==0) {
				break;
			}
			int aa = a*a;
			int bb = b*b;
			int cc = c*c;
			if (aa+bb==cc) {
				System.out.println("right");
				continue;
			} else if(aa+cc==bb) {
				System.out.println("right");
				continue;
			} else if(bb+cc==aa) {
				System.out.println("right");
				continue;
			}
			System.out.println("wrong");
		}
	}
}
