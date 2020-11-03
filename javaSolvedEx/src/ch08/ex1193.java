package ch08;

import java.util.Scanner;

public class ex1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int row = 0;
		int nextMin = 1;
		for (int i = 1; i <= x; i++) {
			count++;
			if (count==nextMin) {
				row++;
				nextMin = 1 + row*(row+1)/2;
			}
		}
		int befMin = nextMin - row;
		int cha = count-befMin;
		
		int res1 = row-cha;
		int res2 = 1+cha;
		
		if (row%2==0) {
			System.out.println(res2+"/"+res1);
		}else {
			System.out.println(res1+"/"+res2);
		}
	}
}
