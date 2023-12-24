package ex5_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// Scanner를 통해 정수 n1, n2에 값을 입력받는다
		// n1 ~ n2까지의 합을 계산하여 결과를 출력
		// ------------------
		// 수1 : 2
		// 수2 : 5
		// 결과 : 14

		// 수1 : 5
		// 수2 : 2
		// 결과 : 14

		Scanner sc = new Scanner(System.in);

		System.out.print("수1 : ");
		int su1 = sc.nextInt();

		System.out.print("수2 : ");
		int su2 = sc.nextInt();

		int res = 0;// su1과 su2사이의 모든 값의 합을 저장할 변수

		//swap
		if( su1 > su2 ) {
			int su3 = su1;
			su1 = su2;
			su2 = su3;
		}
		
		for (int i = su1; i <= su2; i++) {
			res += i;
		}

		System.out.println("결과 : " + res);

	}// main
}










