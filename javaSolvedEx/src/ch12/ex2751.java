package ch12;

import java.util.Scanner;

public class ex2751 {
	static int n;
	static int[] data = new int[1000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		quickSort(data, 0, n-1);
		for (int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}
	
	public static void quickSort(int[] data, int start, int end) {
		if(start >= end) return;
		int key = start;
		int i = start + 1, j = end, temp;
	
		while(data[i] <= data[key] & i < n) {
			i++;
		}
		while(data[j] >= data[key] & j > start) {
			j--;
		}
		if(i > j) {
			temp = data[j];
			data[j] = data[key];
			data[key] = temp;
		} else{
			temp = data[j];
			data[j] = data[i];
			data[i] = temp;
		}
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
}
