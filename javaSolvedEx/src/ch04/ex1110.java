package ch04;

import java.util.Scanner;

public class ex1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = x;
		int a = 0,b = 0,c = 0,d = 0, i = 0;
		a = x/10;
		b = x-(10*a);
		c = (a + b)%10;
		d = (b*10)+c;
		x = d;
		i++;
		
		while (x!=y) {
			a = x/10;
			b = x-(10*a);
			c = (a + b)%10;
			d = (b*10)+c;
			x = d;
			i++;
		}
		System.out.println(i);
	}
}