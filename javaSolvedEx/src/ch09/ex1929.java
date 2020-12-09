package ch09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		Loop1 : for (int i = m; i <= n; i++) {
			if (i == 1) continue;
			if (i == 2) {
				System.out.println(i);
				continue;
			}
			if (i == 3) {
				System.out.println(i);
				list.add(i);
				continue;
			}
			if (i%2 == 0) continue;
			for (int j = 0; j < list.size(); j++) {
				if (i%list.get(j)==0) {
					continue Loop1;
				}
			}
			list.add(i);
			System.out.println(i);
		}
	}
}
