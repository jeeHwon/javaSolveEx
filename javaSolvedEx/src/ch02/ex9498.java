package ch02;
import java.util.Scanner;
public class ex9498 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		if (a >= 90) {
			System.out.println("A");
		} else if (a>=80) {
			System.out.println("B");
		} else if (a>=70) {
			System.out.println("C");
		} else if (a>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
