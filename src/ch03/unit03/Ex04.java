package ch03.unit03;

public class Ex04 {

	public static void main(String[] args) {
		int a = 13, b = 20;
		int c, d;
		
		//	짝수 홀수를 판별할 수 있음
		c = a & 1;	// 1 , 2진수로 구했을 때 홀수는 모두 1으로 끝남
		d = b & 1;	// 0 , 2진수로 구했을 때 짝수는 모두 0으로 끝남
		System.out.println(c + "," + d);
		
	}

}
