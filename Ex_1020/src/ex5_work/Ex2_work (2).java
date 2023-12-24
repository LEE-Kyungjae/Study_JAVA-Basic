package ex5_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 수 두개의 최소공배수를 구하시오
		//예를들어 2,5를 입력받았다면 10을, 
		//4,6을 입력받았다면 12를 출력해야 한다
		//-------------------------
		//수1 : 4
		//수2 : 6
		//최소공배수 : 12
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		for( int i = 1; i <= n1 * n2; i++ ) {
			
			if( i % n1 == 0 && i % n2 == 0 ) {
				System.out.println("최소공배수 : " + i);
				break;
			}
			
		}//for
		
	}//main
}









