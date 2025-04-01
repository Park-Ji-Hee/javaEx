package ch02.unit04;

public class Ex05_Precision {
	public static void main(String[] args) {
		// 정밀도
		int i1 = 2_000_000_000;	// "_"없어도 됨(for 구분)
		int i2 = 2_000_000_050;
		
		float f1 = 2_000_000_000;
		float f2 = 2_000_000_050;
		
		double d1 = 2_000_000_000;
		double d2 = 2_000_000_050;

		System.out.printf("int : %d %d\n", i1, i2);	//	2000000000 2000000050
		System.out.printf("float : %.2f %.2f\n", f1, f2);	//	2000000000.00 2000000000.00	=>	오차가 많이 발생	
															//	=>	연산에서 float을 사용하는건 위험 == 웬만해서 double써라
		System.out.printf("double : %.2f %.2f\n", d1, d2);	//	2000000000.00 2000000050.00
	}
}
