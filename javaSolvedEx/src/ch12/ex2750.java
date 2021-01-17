package ch12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2750 {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int first = sc.nextInt();
		list.add(first);
		for (int i = 0; i < n-1; i++) {
			int m = sc.nextInt();
			Boolean isOk = false;
			for (int j = 0; j < list.size()-1; j++) {
				if (m>list.get(j) && m<list.get(j+1)){
					list.add(j+1,m);
					isOk = true;
					break;
				}
			}
			if(m>list.get(list.size()-1)) {
				list.add(list.size(),m);
				continue;
			}
			if(!isOk) {
				list.add(0,m);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
