package ch03;
import java.util.Scanner;
public class ex10950 {
	//A+B -3
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		for (int i = 0; i < a; i++) {
			int b = num.nextInt();
			int c = num.nextInt();
			System.out.println(b+c);
		}
	}
}
