//package ch04.unit01;
//
//import java.util.Scanner;
//
//public class Quize06 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		double kg, cm, m;
//		double bmi;
//		
//		System.out.print("체중 (kg) ? ");
//		kg = sc.nextDouble();
//		
//		System.out.print("키 (cm) ? ");
//		cm = sc.nextDouble();
//		
//		m = cm / 100;
//		bmi = kg / (m * m);
//		
//		System.out.printf("몸무게 : %.2fkg\n", kg);
//		System.out.printf("키 : %.2fm\n", m);
//		System.out.printf("BMI : %.1f\n", bmi);
//
//		sc.close();
//	}
//
//}


package ch03.unit01;
import java.util.Scanner;
public class Quize06 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("체중 (kg) ? ");
		int w = sc.nextInt();
		
		System.out.print("키 (cm) ? ");
		int h = sc.nextInt();
		
		double kg = (double)w;
		double m = h * 1e-2;
		double bmi = w / (m * m);
		
		System.out.printf("몸무게 : %.2fkg\n", kg);
		System.out.printf("키 : %.2fm\n", m);
		System.out.printf("bmi : %.1f\n", bmi);
		
		sc.close();
	}
}