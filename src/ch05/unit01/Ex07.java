package ch05.unit01;

public class Ex07 {

	public static void main(String[] args) {
		// 1~10까지 난수를 100개 발생하여 한 줄에 10개씩 출력하고
		// 마지막에 발생횟수를 출력하는 프로그램 작성
		
		int []count = new int[10];
		int n;
		
		for(int i = 0; i <100; i++) {
			n = (int)(Math.random() * 10) + 1;
			
			count[n-1]++;
			 
			System.out.print(n + "\t");
			if((i+1) % 10 == 0) {	// i%9==0으로 하게 되면 -> i가 0일 때 혼자 한줄에 있기 때문
				System.out.println();
			}
		}
		System.out.println("\n숫자별 발생 횟수...");
		for(int i = 0; i<count.length; i++) {
			System.out.println((i+1) + " : " + count[i]);
		}
	}

}
