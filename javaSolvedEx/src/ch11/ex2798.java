package ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2798 {
	static int n, m, x = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String firstLine = bf.readLine();
		n = Integer.parseInt(firstLine.split(" ")[0]);	// n: 카드의 개수
		m = Integer.parseInt(firstLine.split(" ")[1]);	// m: 카드 3개 최대합
											// r: 
		boolean[] visited = new boolean[n];
		
        int[] arr = new int[n];							// arr : 둘째줄 제시된 카드 배열
        StringTokenizer secondLine = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(secondLine.nextToken());
        }
		       
        comb(arr, visited, 0, n, 3);
        System.out.println(x);
		
	}
	
	static void comb(int[] arr, boolean[] visited, int start, int n, int r) {
	    if(r == 0) {
	        sum(arr, visited, n);
	    } 
	    for(int i=start; i<n; i++) {
	        visited[i] = true;
	        comb(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}

    static void sum (int[] arr, boolean[] visited, int n) {
    	int result = 0;
    	for (int i = 0; i < n; i++) {
    		if (visited[i]) {
    			result += arr[i];
    		}
    	}
    	if(result <= m && result > x) {
    		x = result;
    	}
    }
}
