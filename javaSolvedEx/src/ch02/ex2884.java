package ch02;
import java.util.Scanner;
public class ex2884 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		if (b >= 45) {
			System.out.println(
					Integer.toString(a)+" "+Integer.toString(b-45));
		} else if (a==0) {
			System.out.println(
					Integer.toString(23)+" "+Integer.toString(b+15));
		} else {
			System.out.println(
					Integer.toString(a-1)+" "+Integer.toString(b+15));
		}
	}
}
