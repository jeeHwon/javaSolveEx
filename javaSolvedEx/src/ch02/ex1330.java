package ch02;
import java.util.Scanner;
public class ex1330 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		int b = num.nextInt();
		
		if (a<b) {
			System.out.println("<");
			
		} else if (a==b) {
			System.out.println("==");
		} else {
			System.out.println(">");
		}

	}
}
