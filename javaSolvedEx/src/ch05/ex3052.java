package ch05;

import java.util.Scanner;

public class ex3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int arr[] = new int[10];
		for(int i=0; i< 10 ; i++) {
			int a = scanner.nextInt();
			arr[i] = a%42;
		}
		for (int i = 0; i < 42; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]==i) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}	
}