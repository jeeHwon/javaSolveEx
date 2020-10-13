package ch01;
import java.util.Scanner;
public class ex10430 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		double a = num.nextInt();
		double b = num.nextInt();
		double c = num.nextInt();
		System.out.println((int)((a+b)%c));
		System.out.println((int)(((a%c) + (b%c))%c));
		System.out.println((int)((a*b)%c));
		System.out.println((int)(((a%c) * (b%c))%c));

	}
}
