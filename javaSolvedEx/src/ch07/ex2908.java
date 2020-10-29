package ch07;

import java.util.Scanner;

public class ex2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (fx(a)>fx(b)) {
			System.out.println(fx(a));
		} else {
			System.out.println(fx(b));
		}
	}
	public static int fx(int i) {
		int i1 = i/100;
		int i2 = (int)((i*0.1)%10);
		int i3 = i%10;
		return (i3*100 + i2*10 + i1);
	}
}
