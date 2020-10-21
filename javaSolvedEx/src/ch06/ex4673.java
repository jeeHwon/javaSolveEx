package ch06;

import java.util.ArrayList;

public class ex4673 {
	public static void main(String[] args) {
		ArrayList tree = new ArrayList();
		for (int i = 0; i < 10000; i++) {
			int d;
			d = i+ i/1000 +i/100%10+ i/10%10+ i%10;
			tree.add(d);
		}
		
		for (int i = 0; i < 10000; i++) {
			if (!tree.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
