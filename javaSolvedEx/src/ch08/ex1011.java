package ch08;

import java.util.Scanner;

public class ex1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testNum = sc.nextInt();
		for (int i = 0; i < testNum; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = y - x;
			
			double sqt = Math.sqrt(n);	//제곱근을 구해
			double bigyo = Math.floor(sqt); //완전 제곱수인지 확인한다
			int min = ((int)bigyo*2);	//완전 제곱수 아닌 경우 그 수보다 작은 완전제곱수
			int middle = (min/2)*((min/2)+1);
			
			int result = 0;
			if (sqt==bigyo) {
				result = ((int)sqt*2)-1;
			}else if (n<=middle) {
				result = min;
			}else {
				result = min+1;
			}
			System.out.println(result);
		}
	}
}