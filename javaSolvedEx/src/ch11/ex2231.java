package ch11;

import java.util.Scanner;

public class ex2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getSengsungja(n));
		
	}
	
	public static int getSengsungja(int n) {
		for(int i=1; i<n+1; i++) {
			int sum = 0;
			int num = i;
			while(num!=0){
				sum += num%10;
				num /= 10;
			}
			if (sum+i == n) {
				return i;
			}
		}
		return 0;
	}
}
