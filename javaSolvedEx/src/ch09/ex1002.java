package ch09;

import java.util.Scanner;

public class ex1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		for (int i = 0; i < caseNum; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			double l1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
			double l2 = r1 + r2;
			System.out.println(l1);
			System.out.println(l2);
			if (l1==0 && r1==r2) {
				System.out.println(-1);
			} else if (l1>l2) {
				System.out.println(0);
			} else if(l1==l2) {
				System.out.println(1);
			} else if((Math.abs(r1-r2))==l1){
				System.out.println(1);
			} else if((Math.abs(r1-r2))>l1){
				System.out.println(0);;
			}
		}
	}	
}
