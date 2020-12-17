package ch09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1929 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		//[1,2,3,4,5,6,7,8,9,10]
		for(int i = m; i <=n; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)==1) {
				list.remove(i);
			} else if(list.get(i)==2) {
				
			}
			
		}
		
	}
}
