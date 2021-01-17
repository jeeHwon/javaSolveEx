package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class ex10250 {

	public static void main(String[] args) throws IOException {
		//2
		//6 12 10
		//30 50 72
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bf.readLine());
		String[] result = new String[test];
		for (int i = 0; i < test; i++) {
			String s = bf.readLine(); 
			StringTokenizer st = new StringTokenizer(s); 
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int ho = (int)Math.ceil(n*1.0/h*1.0);
			int floor = n%h;
			if (floor==0) {
				floor = h;
			}
			DecimalFormat df = new DecimalFormat("00");	
			result[i] = floor+df.format(ho);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
