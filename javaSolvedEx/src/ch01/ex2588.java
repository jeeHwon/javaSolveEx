package ch01;
import java.lang.Math;
import java.util.Scanner;
public class ex2588 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		int ans1 = a*(b%10);
		int ans2 = a*(int)((Math.floor(b*0.1))%10);
		int ans3 = a*(int)(b/100);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(100*ans3 + 10*ans2 + ans1);
	}
}
