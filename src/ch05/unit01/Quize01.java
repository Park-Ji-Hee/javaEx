package ch05.unit01;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []tti = new String[] {"원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양", };
		// 12로 나누었을 때 나머지가 0이 되는 원숭이를 가장 앞에 두기
		int y;
		
		do {
			System.out.print("년도 ? ");
			y= sc.nextInt();
		} while(y < 1900);
		

		String s = tti[y%12];
		
		System.out.printf("%d년도는 %s띠의 해입니다.", y, s);
		sc.close();
	}

}
