package ch02;
import java.util.Scanner;
public class ex14681 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		if (a>0) {
			if (a*b>0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else if (a*b>0) {
			System.out.println(3);
		} else {
			System.out.println(2);
		}
	}
}
