package ch07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] intArr = new int[n];
		String[] strArr = new String[n];
		List list = new ArrayList();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			intArr[i] = Integer.parseInt(arr[0]);
			strArr[i] = arr[1];
						
		}
		for (int i = 0; i < strArr[i].length(); i++) {
			String[] temp = strArr[i].split("");
			for (int k = 0; k < intArr[i]; k++) {
				for (int j = 0; j < temp.length; j++) {
					System.out.print(temp[j]);
				}
				
			}
		}
		
		


		
//		for (int i = 0; i < n; i++) {
//			String str = sc.nextLine();
//			String[] arr = str.split(" ");
//			int m = Integer.parseInt(arr[0]);
//			String[] splitString = arr[1].split("");
//			for (int j = 0; j < splitString.length; j++) {
//				if (splitString[j].equals("\\")) {
//					splitString[j]="\\";
//				}
//				for (int j2 = 0; j2 < m; j2++) {
//					System.out.print(splitString[j]);
//				}
//			}
//		}
	}
}
