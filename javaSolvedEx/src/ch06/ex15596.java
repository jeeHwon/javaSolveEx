package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex15596 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] sarray = str.split(" ");

		int[] array = new int[sarray.length];
		for (int i = 0; i < sarray.length; i++) {
			array[i] = Integer.parseInt(sarray[i]);
		}
		
		System.out.println(sum(array));
		String name1 = new String("JAVA");
		String name2 = new String("JAVA");
		if (name1.equals(name2)) {
			System.out.println("pass");
		}
		
		
	}
	
	static long sum(int[] a) {
		long result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
