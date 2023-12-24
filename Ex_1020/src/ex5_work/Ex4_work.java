package ex5_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 두 수의 최대공약수 구하기
		//예를들어 10, 4를 입력 받았다면 2가
		//3, 7을 입력받았다면 '최대공약수가 없습니다'를 출력.
		Scanner sc = new Scanner(System.in);
		int check = 0;
		
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		if( n1 >= n2 ) {
			check = n1;
		}else {
			check = n2;
		}
		
		int i = 0;
		for( i = check; i >= 1; i-- ) {
			if( n1 % i == 0 && n2 % i == 0 ) {
				break;
			}
		}//for
		
		if( i == 1 ) {
			System.out.println("최대공약수가 없습니다");
		}else {
			System.out.println("최대공약수 : " + i);
		}
		
	}//main
}












