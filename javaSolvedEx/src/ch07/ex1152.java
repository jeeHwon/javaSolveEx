package ch07;

import java.util.Scanner;

public class ex1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		if (str.length()==1) {
			if ((int)str.charAt(0)==32) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}else if ((int)str.charAt(0)==32) {
			for (int i = 0; i < str.length()-1; i++) {
				//System.out.println(str.charAt(i));
				//System.out.println((int)str.charAt(i));
				if ((int)str.charAt(i)==32 && (int)str.charAt(i+1)!=32 ) {
					count++;
				}
			}
			System.out.println(count);
		} else {
			for (int i = 0; i < str.length()-1; i++) {
				//System.out.println(str.charAt(i));
				//System.out.println((int)str.charAt(i));
				if ((int)str.charAt(i)==32 && (int)str.charAt(i+1)!=32 ) {
					count++;
				}
			}
			System.out.println(count+1);
		}
	}
}
