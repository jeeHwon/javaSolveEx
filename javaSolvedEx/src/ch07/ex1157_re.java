package ch07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex1157_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = str1.toUpperCase();
		String[] arr1 = str2.split("");
		ArrayList<String> list1 = new ArrayList<String>();
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}
		Collections.sort(list1);
		//문자를 받아 list로 각 대문자로 입력
		ArrayList<Test> list2 = new ArrayList<Test>();
		
		int count = 1;
		for (int i = 0; i < list1.size()-1; i++) {
			if (list1.get(i).equals(list1.get(i+1))) {
				count ++;
				
			} else {
				list2.add(new Test(count, list1.get(i)));
				count = 1;
			}
		}
		list2.add(new Test(count, list1.get(list1.size()-1)));

		boolean check = true;
		Test ttt = new Test(0, "a");
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).getIdx()>ttt.getIdx()) {
				check = true;
				ttt.setIdx(list2.get(i).getIdx());
				ttt.setChr(list2.get(i).getChr());
			} else if (list2.get(i).getIdx()==ttt.getIdx()) {
				check = false;
			}
		}
		if (check) {
			System.out.println(ttt.getChr());
		} else {
			System.out.println("?");
		}
	}
}
class Test {
	public int idx;
	public String chr;
	Test () {}
	Test(int i, String s){
		this.idx = i;
		this.chr = s;
	}
	public int getIdx() {
		return idx; 
	}
	public String getChr() {
		return chr;
	}
	public void setIdx(int i) {
		this.idx = i;
	}
	public void setChr(String s) {
		this.chr = s;
	}
}
