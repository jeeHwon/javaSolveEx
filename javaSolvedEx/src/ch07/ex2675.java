package ch07;

import java.util.Scanner;

public class ex2675 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] intArr = new int[n];
		String[] strArr = new String[n];
		
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			intArr[i] = Integer.parseInt(arr[0]);
			strArr[i] = arr[1];
		}
		for (int i = 0; i < n; i++) {
			String[] temp = strArr[i].split("");
			for (int j = 0; j < temp.length; j++) {
				for (int j2 = 0; j2 < intArr[i]; j2++) {
					System.out.print(temp[j]);
				}
			}
			System.out.print("\n");
		}
	}
}
