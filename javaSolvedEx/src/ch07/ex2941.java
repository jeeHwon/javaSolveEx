package ch07;

import java.util.Scanner;

public class ex2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z=" };
		for (int i = 0; i < arr.length; i++) {
			str = str.replaceAll(arr[i], "R");
		}
		System.out.println(str.length());
	}
}