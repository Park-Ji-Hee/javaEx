package ch03.unit03;

public class Ex05 {

	public static void main(String[] args) {
		int a;
		int b;
		
		a = 128;
		
		b = a << 3;	// 128 * 8(== 2^3; 왼쪽으로 3칸만큼 가라)
		System.out.println(b);	// 1024

		b = a >> 3;	// 128 / 8(== 2^-3; 오른쪽으로 3칸만큼 가라)
		System.out.println(b);	// 16
		
		// 오른쪽으로 이동 후부호로 채움
		a = -128; 
		b = a >> 3;	//	-128 / 8
		System.out.println(b);	// -16
		
		// 오른쪽으로 이동 후 0으로 채움
		a = -128; 
		b = a >>> 3;	//	             
		System.out.println(b);	// 536870896

		
		
		
	}

}
