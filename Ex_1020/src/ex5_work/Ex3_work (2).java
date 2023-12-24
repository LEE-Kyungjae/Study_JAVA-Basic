package ex5_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		
		//피보나치 수열 만들기
		//1 1 2 3 5 8 13 21... 바로 앞의 숫자 두개의 합이 연속적으로 출력
		//키보드에서 값을 입력받고, 입력받은 횟수만큼의 피보나치 수열을 출력
		//-------------------
		//반복횟수 : 6
		//1 1 2 3 5 8
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수 : ");
		int cnt = sc.nextInt();
		
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		for( int i = 0; i < cnt; i++ ) {
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			System.out.print(num3 + " ");
		}//for
		
	}//main
}













