package ch10;

import java.util.Scanner;

public class ex10870 {
	//0, 1, 2, 3, 4, 5, 6, 7  
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
	}
	static int fibonacci(int x) {
		if(x == 1) {
			return 1;
		} else if(x==0) {
			return 0;
		}
		return fibonacci(x-2) + fibonacci(x-1); 
	}
}
