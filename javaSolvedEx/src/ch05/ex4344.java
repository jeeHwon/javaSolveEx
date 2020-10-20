package ch05;

import java.util.Scanner;

public class ex4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //테스트 케이스 개수 n
		for (int i = 0; i < n; i++) { //각 케이스 마다
			int m = sc.nextInt(); // 성적 개수 m
			double d = 0; // 점수 총합 d 
			int[] arr = new int[m]; // 총 m개의 성적이 들어가는 배열생성
			for (int j = 0; j < m; j++) { //하나의 케이스 에서
				int tmp = sc.nextInt();  //tmp 에 점수를 입력받아
				d += tmp; // d에 누적으로 더한다
				arr[j] = tmp; // 그리고 빈 배열에 점수를 입력한다
			}
			double avg = d/m; //평균은 총합 d를 성적개수 m으로 나눈 값
			double good = 0; // 평균을 넘는 인원의 수 good
			for (int j = 0; j < m; j++) { //하나의 케이스에서
				if (arr[j]>avg) { //배열 각 각의 값이 평균보다 높다면
					good += 1; // 평균넘는 인원수를 한명씩 추가
				}
			}
			double result = Math.round(good/m*100000)*0.001;
			System.out.println(String.format("%.3f",result)+"%");
		}
	}
}
