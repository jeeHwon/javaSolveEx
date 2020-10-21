package ch07;

import java.util.Scanner;

public class ex10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] arr = s1.split("");
	
		for (int j = 97; j < 123; j++) {
			char c = (char)j;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(Character.toString(c))) {
					System.out.print(i+" ");
					break;
				}else if (i==arr.length-1) {
					System.out.print("-1 ");
				}
			}
		}
	}
}
