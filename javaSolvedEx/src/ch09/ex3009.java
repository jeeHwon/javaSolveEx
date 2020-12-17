package ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int p1x = Integer.parseInt(str[0]);
        int p1y = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        int p2x = Integer.parseInt(str[0]);
        int p2y = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        int p3x = Integer.parseInt(str[0]);
        int p3y = Integer.parseInt(str[1]);
		
        int p4x = 0;
        int p4y = 0;
        if (p1x==p2x) {
			p4x = p3x;
		} else if(p1x==p3x) {
			p4x = p2x; 
		} else {
			p4x = p1x;
		}
        if (p1y==p2y) {
        	p4y = p3y;
        } else if(p1y==p3y) {
        	p4y = p2y; 
        } else {
        	p4y = p1y;
        }
        String result = p4x+" "+p4y;
        bw.write(result);
        bw.flush();
        bw.close();
	}
}
