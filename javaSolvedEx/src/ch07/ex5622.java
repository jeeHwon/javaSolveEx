package ch07;

import java.util.Scanner;

public class ex5622 {
	///abc3 def 4 ghi 5 jkl 6 ..wxyz 10
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>=80 &&str.charAt(i)<84 ) {
				result += 8;
			}else if (str.charAt(i)>=84 &&str.charAt(i)<87) {
				result += 9;
			}else if (str.charAt(i)>=87 ) {
				result += 10;
			}else {
				result += (str.charAt(i)-56)/3;
			}
		}
		System.out.println(result);
	}
}
