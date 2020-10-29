package ch07;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int result = 0;
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			if (fx(str)) {
				result++;
			}
		}
		System.out.println(result);
	}
	public static boolean fx(String s) {

		char[] ch = s.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (!list.contains(ch[i])) {
				list.add(ch[i]);
			}else {
				if (ch[i-1]!=ch[i]) {
					return false;
				} 
			}
		}
		return true;
	}
}
