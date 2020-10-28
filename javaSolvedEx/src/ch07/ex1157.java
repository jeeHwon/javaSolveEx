package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //zaaccc
		String s = sc.nextLine(); //문자 읽어서 s 저장 zaaccc
		String S = s.toUpperCase(); //대문자로 바꿔서 S 저장 ZAACCC
		String[] sarr = S.split(""); // 문자별로 나눠서 배열로 저장
		List list = Arrays.asList(sarr); //배열을 리스트로 전환
		Collections.sort(list);//리스트를 순서대로 정렬
		//list = {A, A, C, C, C, Z} ZZZ
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> result2 = new ArrayList<Integer>();
		//result 

		
		if (list.size()==1) {
			System.out.print(list.get(0));
		}else if (list.size()==2) {
			if (list.get(0).equals(list.get(1))) {
				System.out.print(list.get(0));
			}else {
				System.out.print("?");
			}
		}else {
			int n = 1;
			for (int i = 0; i < list.size()-1; i++) {//list.size 3
				if (list.get(i).equals(list.get(i+1))) { 
					n++;
				}else {
					result.add(n);
					n = 1;
				}
			}
			result.add(n);
			//result = {3}
			for (int i = 0; i < result.size(); i++) { //1
				result2.add(result.get(i)); //re2=3
			}
			Collections.sort(result);//result = {3}
			int k = result.size();//1
			if (result.size()==1) {
				System.out.print(list.get(0));
			}else {
				if (result.get(k-2)==result.get(k-1)) {
					System.out.print("?");
				} else {
					int m = result2.indexOf(result.get(k-1));
					int q = 0;
					for (int i = 0; i <= m; i++) {
						q = q + result2.get(i);
					}
					System.out.print(list.get(q-1));
				}
			}
		}
	}
}
