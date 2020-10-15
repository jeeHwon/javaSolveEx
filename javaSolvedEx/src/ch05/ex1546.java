package ch05;

import java.util.Scanner;

public class ex1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		double n = (double)m;
		double[] arr = new double[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
		}
		double max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				double temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		max = arr[m-1];
		double[] arr2 = new double[m];
		for (int i = 0; i < arr.length; i++) {
			//arr2[i] = (arr[i]/m)*100.0;
			arr2[i] = arr[i]/max*100;
		}
		double total = 0;
		for (int i = 0; i < arr2.length; i++) {
			total = total + arr2[i];
		}
		double avg = total/m;
		System.out.println(avg);
	}
}

