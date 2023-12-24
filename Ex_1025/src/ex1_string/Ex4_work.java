package ex1_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//변수 question에 O, X값을 집어넣는다
		//OOXXO라면 1 + 2 + 0 + 0 + 1 = 4
		//OOOXOO라면 1 + 2 + 3 + 0 + 1 + 2 = 9
		//OXXOOXOOO라면 1 + 0 + 0 + 1 + 2 + 0 + 1 + 2 + 3 = 10
		//-----------------
		//입력 : OXXOOXOOO
		//결과 : 10
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String question = sc.next();
		
		int cnt = 0;
		int sum = 0;
		
		for( int i = 0; i < question.length(); i++ ) {
			
			if( question.charAt(i) == 'O' ) {
				cnt++;
			}else {
				cnt = 0;
			}
			
			sum += cnt;
			
		}//for
		
		System.out.println("결과 : " + sum);
		
	}//main
}










