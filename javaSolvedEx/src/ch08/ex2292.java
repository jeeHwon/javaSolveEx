package ch08;

import java.util.Scanner;

public class ex2292 {

	public static void main(String[] args) {
		//1 1
		//2-7  (6) 2
		//8-19 (12) 3 
		//20-37 (18) 4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 1;
		int loc = 1;
		
		while (n>max) {
			max = 1 + (3*loc)*(loc+1);
			loc++;
		}
		System.out.println(loc);
	}
}
