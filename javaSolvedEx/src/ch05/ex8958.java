package ch05;

import java.util.Scanner;

public class ex8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		//String fake = sc.nextLine();
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			char[] arr = str[i].toCharArray();
			int tot = 0;
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]=='O') {
					tot = tot + (count+1);
					count = count + 1;
				} else {
					count = 0;
				}
			}
			System.out.println(tot);
		}
		sc.close();
	}
}
