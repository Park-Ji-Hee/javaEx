package ch05.unit01;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []score = new int[5];
		int max, min;
		int tot, result;
		
		tot = 0;
		
		for(int i = 0; i < score.length ; i++) {
			do {
				System.out.print((i+1) + "번째 접수 : " );
				score[i]= sc.nextInt();
			} while(score[i] < 0 || score[i] >10);
			
			tot += score[i];
			
		}
		
		//  최대 / 최소 : 가장 처음값을 초기값으로
		max = min = score[0]; // 정수로 초기 값 주려면 max=0, min=10으로 할 수 있음
		for( int i = 0 ; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}
		
		result = tot - max - min;
		System.out.print("점수 리스트 : ");
		for(int n : score) {
			System.out.print(n + " ");
		}
		System.out.print("\n취득 점수 : " + result);
		
		sc.close();
	}

}
