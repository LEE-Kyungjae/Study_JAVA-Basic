package ex5_work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받고 그 수가 소수인지 아닌지를 판단하시오
		//소수 : 1과 자기 자신으로만 나눠지는 수(1은 소수가 아님)
		//------------------
		//값 : 5
		//5은(는) 소수입니다
		
		//값 : 6
		//6은(는) 소수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		int n = sc.nextInt();
		
		int i = 2;
		
		for( ; i <= n; i++) {
			
			if( n % i == 0 ) {
				break;
			}
			
		}//for
		
		if(n == i) {
			System.out.println(n + "은(는) 소수");
		}else {
			System.out.println(n + "은(는) 안소수");
		}
		
		
	}//main
}





















