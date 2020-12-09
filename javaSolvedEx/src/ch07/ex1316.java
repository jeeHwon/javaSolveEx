package ch07;

import java.io.*;
import java.util.ArrayList;

public class ex1316 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (fx(str)) {
				result++;
			}
		}
		bw.write(result+"");
		bw.flush();
	}
	public static boolean fx(String s) {
		char[] ch = s.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < ch.length; i++) {
			if (!list.contains(ch[i])) {	//리스트에 해당 문자가 존재하지 않으면 추가
				list.add(ch[i]);
			}else {
				if (ch[i-1]!=ch[i]) {	//리스트에 해당 문자가 존재하나 연속 아닌경우 false 반환
					return false;
				} 
			}
		}
		return true;
	}
}
