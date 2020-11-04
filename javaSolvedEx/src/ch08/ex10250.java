package ch08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10250 {

	public static void main(String[] args) {
		//h w  n
		//6 12 10 : 402
		//30 50 72 : 1203
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int mok = n/h;
			int cha = n-(mok*h);
			DecimalFormat df = new DecimalFormat("00");	
			String ho = df.format(mok+1);
			System.out.println(cha+ho);
		}
	}
}
